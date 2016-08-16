package com.xpts.csg.common;

/**
 * Exception that occurs whilst serializing and deserializing.
 *
 */
public class SerializationException extends RuntimeException {

	private static final long serialVersionUID = -6157310279293403805L;

	public SerializationException(String message) {
		super(message);
	}

	public SerializationException(String message, Throwable cause) {
		super(message, cause);
	}
}
