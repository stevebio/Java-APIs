package com.smartlogic.ontologyeditor;

public class OEClientException extends Exception {
	private static final long serialVersionUID = 1L;

	public OEClientException(String message) {
		super(message);
	}

	public OEClientException(String format, Object... arguments) {
		super(String.format(format, arguments));
	}

}
