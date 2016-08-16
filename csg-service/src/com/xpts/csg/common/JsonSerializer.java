package com.xpts.csg.common;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
import static com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT;
import static com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL;

import java.io.Serializable;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonSerializer<T> implements Serializer<T>, Serializable {
	
	private static final long serialVersionUID = 8119812750145737472L;
	
	private Class<T> type;
	
	private ObjectMapper mapper;
	
	private JsonSerializer(Class<T> type, boolean polymorphic) {
		this.type = type;
		this.mapper = new ObjectMapper()
			.setTimeZone(TimeZone.getDefault())
			.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
			.setVisibility(PropertyAccessor.ALL, Visibility.NONE)
			.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		if (!polymorphic) {
			this.mapper.enableDefaultTyping(JAVA_LANG_OBJECT);
		} else {
			this.mapper.enableDefaultTyping(NON_FINAL, PROPERTY);
		}
	}	
	
	public static <T> JsonSerializer<T> create(Class<T> type, boolean polymorphic) {
		return new JsonSerializer<T>(type, polymorphic);
	}

	@Override
	public String serialize(T object) throws SerializationException {
		try {
			return mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			throw new SerializationException("Failed to serialize an instance of " + type, e);
		}
	}

	@Override
	public T deserialize(String data) throws SerializationException {
		try {
			return mapper.readValue(data, type);
		} catch (Exception e) {
			throw new SerializationException("Failed to deserialize an instance of " + type, e);
		}
	}
}
