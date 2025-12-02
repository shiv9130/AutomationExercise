package FrameworkExceptionsAE;

public class frameworkException extends RuntimeException {
	
	public frameworkException(String message) {
		super(message);
		
	}
	
	public frameworkException(String message,  Throwable cause) {
		super(message, cause);
		
	}

}
