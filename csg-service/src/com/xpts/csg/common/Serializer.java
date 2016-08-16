package com.xpts.csg.common;

/**
 * Serializes and deserializes an Object
 *
 * @param <T>
 *            The type of the Object
 */
public interface Serializer<T> {

	/**
	 * Serializes an Object to String
	 * 
	 * @param object
	 *            The Object to serialize
	 * @return The String representation of the Object
	 * @throws SerializationException
	 *             if something went wrong whilst serializing
	 */
	String serialize(T object) throws SerializationException;

	/**
	 * Deserializes String to an Object
	 * 
	 * @param data
	 *            The String to deserialize
	 * @return The Object representation of the String
	 * @throws SerializationException
	 *             if something went wrong whilst deserializing
	 */
	T deserialize(String data) throws SerializationException;
}
