package com.ciec.mem.exception;

public class MatrimonyException extends Exception {

	private static final long serialVersionUID = -1584954226820254124L;

	public MatrimonyException(Throwable cause) {
		super(cause);
	}

	public MatrimonyException(String message) {
		super(message);
	}

	public MatrimonyException(String message, Throwable cause) {
		super(message, cause);
	}
}
