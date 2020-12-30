package main;

import data.AuthorizeSystem;
import ui.UserMode;

public class Main {
	
	private AuthorizeSystem authSys;
	private UserMode userMode;
	
	public static void main(String[] args) {
		Injector injector = new Injector();
		injector.initialize_obj();
	}
	
	public void enterAsTrainer() {}
	
	public void enterAsClient() {}

}
