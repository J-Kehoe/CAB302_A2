package sMart.Exceptions;

import java.io.IOException;

public class CSVFormatException extends IOException {
	
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
