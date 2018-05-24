package sMart;

import java.io.IOException;

public class CSVFormatException extends IOException {
	
	CSVFormatException() { 
	}
	
	CSVFormatException(String message) { 
		super(message);
	}
	
	CSVFormatException(IOException ex) { 
		super(ex);
	}
	
}
