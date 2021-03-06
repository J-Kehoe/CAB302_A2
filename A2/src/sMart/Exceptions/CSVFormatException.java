package sMart.Exceptions;

/**
 * The CSVFormatException class extends IllegalArgumentException. It checks if a csv file being parsed is in the
 * correct format.
 * 
 * @author Lara de Maroussem
 *
 */

public class CSVFormatException extends IllegalArgumentException {
	
	CSVFormatException() { }
	
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
