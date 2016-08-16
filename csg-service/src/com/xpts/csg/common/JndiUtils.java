package com.xpts.csg.common;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.naming.InitialContext;

@SuppressWarnings("unchecked")
public class JndiUtils {
	
	private static Map<String, Object> jndiCache = new ConcurrentHashMap<>();
	
	private JndiUtils() {}

	public static <T> T lookup(String name) {
		T result = (T) jndiCache.get(name);
		if (result == null) {
			try {
				result = (T) new InitialContext().lookup(name);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			jndiCache.put(name, result);
		}
		return result;
	}
}
