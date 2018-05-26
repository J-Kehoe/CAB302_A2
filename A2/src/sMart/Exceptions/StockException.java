package sMart.Exceptions;

import java.io.IOException;

public class StockException extends IOException {
	
	StockException() { 
	}
	
	public StockException (String message) { 
		super(message);
	}
	
	public StockException (Throwable cause) {
        super (cause);
    }

    public StockException (String message, Throwable cause) {
        super (message, cause);
    }
	
}
