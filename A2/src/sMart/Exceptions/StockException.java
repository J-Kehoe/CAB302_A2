package sMart.Exceptions;

import java.io.IOException;

/**
 * The CSVFormatException class extends IOException. It checks if a stock is being generated in the correct format.
 * 
 * @author Lara de Maroussem
 *
 */


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
