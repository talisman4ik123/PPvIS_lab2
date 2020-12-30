package main;

import data.Excercise;
import data.Nutrition;
import data.Program;
import data.Role;
import data.SeasonTicket;
import ui.NewClient;
import ui.Trainer;

public class Injector {

	public void initialize_obj() {
		NewClient newClient = new NewClient();
		Trainer trainer = new Trainer();
		Excercise excercise = new Excercise();
		Program program = new Program();
		Nutrition nutrition = new Nutrition();
		SeasonTicket seasonTicket = new SeasonTicket();
		
	}
}
