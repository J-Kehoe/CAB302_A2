package sMart;

public class Store {
	
	private double capital;
	private double inventory;
	private String name;
	
	private static final Store instance = new Store();
	
	private Store() {}
	
	public static Store getInstance() {
		return instance;
	}
	
	public void capital () {
		this.capital = capital;
		
	}
	
	public void inventory () {
		
	}
	
	public void name () {
		
	}

}
