package ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import data.Account;
import data.Excercise;
import data.Nutrition;
import data.Program;

public class Trainer extends Account {

	private String name;
	private String surname;
	/*!*/
	//private Client client;
	private Program program;
	private Nutrition nutrition;
	private Excercise exercise;
	private Display display = new Display();
	private Shell shell = new Shell(this.display, SWT.MAX | SWT.TITLE | SWT.CLOSE | SWT.SHELL_TRIM);
	
	
	public Trainer() {
		
		shell.setBounds(500, 100, 400, 350);
		shell.open();		
		
		Label labelMain = new Label (shell, SWT.NONE);
		labelMain.setText("Trainer");
		labelMain.setBounds(145, 75, 250, 20);
			
		Button showClients = new Button (shell, SWT.PUSH);
		showClients.setText("Show Clients");
		showClients.setBounds(125, 193, 150, 28);
		showClients.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				showClients();
			}
		});
		
		Button showClientProfile = new Button (shell, SWT.PUSH);
		showClientProfile.setText("Show client's profile");
		showClientProfile.setBounds(125, 193, 150, 28);
		showClientProfile.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				showClients();
			}
		});
		
		Button addProgramToClient = new Button (shell, SWT.PUSH);
		addProgramToClient.setText("Add program to client");
		addProgramToClient.setBounds(125, 193, 150, 28);
		addProgramToClient.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				addProgramToClient();
			}
		});
		
		Button addExerciseToClient = new Button (shell, SWT.PUSH);
		addExerciseToClient.setText("Add exercise to client");
		addExerciseToClient.setBounds(125, 193, 150, 28);
		addExerciseToClient.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				addExerciseToClient();
			}
		});
		
		Button removeExerciseFromClient = new Button (shell, SWT.PUSH);
		removeExerciseFromClient.setText("Remove exercise from client");
		removeExerciseFromClient.setBounds(125, 193, 150, 28);
		removeExerciseFromClient.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				removeExerciseFromClient();
			}
		});
		
		Button addNutritionToClient = new Button (shell, SWT.PUSH);
		addNutritionToClient.setText("Add nutrition to client");
		addNutritionToClient.setBounds(125, 193, 150, 28);
		addNutritionToClient.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				addNutritionToClient();
			}
		});
		
		Button removeNutritionFromClient = new Button (shell, SWT.PUSH);
		removeNutritionFromClient.setText("Remove nutrition from client");
		removeNutritionFromClient.setBounds(125, 193, 150, 28);
		removeNutritionFromClient.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				removeNutritionFromClient();
			}
		});
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurame(String surname) {
		this.surname = surname;
	}
	
	public String getSurame() {
		return surname;
	}
	
	public void setProgram(Program pr) {
		program = pr;
	}
	
	public Program getProgram() {
		return program;
	}
	
	public void setNutrition(Nutrition nutrition) {
		this.nutrition = nutrition;
	}
	
	public Nutrition getNutrition() {
		return nutrition;
	}
	
	public void setExercise(Excercise ex) {
		exercise = ex;
	}
	
	public Excercise getExercise() {
		return exercise;
	}
	
	/*!*/
	public void showClients() {}
	
	public void showClientProfile() {}
	
	public Program addProgramToClient() {
		return program;
	}
	
	public Excercise addExerciseToClient() {
		return exercise;
	}
	
	public void removeExerciseFromClient() {}
	
	public Nutrition addNutritionToClient() {
		return nutrition;
	}
	
	public void removeNutritionFromClient() {}
	
}
