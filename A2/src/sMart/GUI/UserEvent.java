package sMart.GUI;

import java.util.EventObject;

public class UserEvent extends EventObject {
	
	private Object[][] table;
	
	public UserEvent(Object source, Object[][] table) {
		super(source);
		
		this.table = table;
	}
	
	public Object[][] getTable() {
		return table;
	}

}
