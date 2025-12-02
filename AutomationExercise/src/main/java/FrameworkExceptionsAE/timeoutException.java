package FrameworkExceptionsAE;

public class timeoutException extends frameworkException  {

	public timeoutException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
	public timeoutException(String message) {
		super(message);
		
	}

}
