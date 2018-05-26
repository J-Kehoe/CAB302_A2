package sMart.Exceptions;


public class CSVFormatException extends IllegalArgumentException {
	
	CSVFormatException() { 
	}
	
	public CSVFormatException(String message) { 
		super(message);
	}
	
	public CSVFormatException (Throwable cause) {
        super (cause);
    }

    public CSVFormatException (String message, Throwable cause) {
        super (message, cause);
    }
	
}
