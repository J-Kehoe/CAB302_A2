package sMart.Exceptions;

import java.io.IOException;

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
