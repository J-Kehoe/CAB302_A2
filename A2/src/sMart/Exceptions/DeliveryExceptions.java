package sMart.Exceptions;

import java.io.IOException;

/**
 * The CSVFormatException class extends IOException. It checks if a delivery is being produced in the correct format.
 * 
 * @author Lara de Maroussem
 *
 */


public class DeliveryExceptions extends IOException {
	
	DeliveryExceptions() { 
	}
	
	public DeliveryExceptions (String message) { 
		super(message);
	}
	
	public DeliveryExceptions (Throwable cause) {
        super (cause);
    }

    public DeliveryExceptions (String message, Throwable cause) {
        super (message, cause);
    }
	
}
