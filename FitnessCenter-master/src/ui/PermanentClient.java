package ui;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import data.Excercise;
import data.Nutrition;
import data.Program;

public class PermanentClient extends NewClient{

	private Long idTicket;
	private List<Excercise> exerciseList;
	private List<Nutrition> nutritionList;
	private Trainer trainer;
	private Long idProgram;
	private Excercise exercise;
	private Nutrition nutrition;
	private Program program;
	private Display display = new Display();
	private Shell shell = new Shell(this.display, SWT.MAX | SWT.TITLE | SWT.CLOSE | SWT.SHELL_TRIM);
	
	
	public PermanentClient() {
		shell.setBounds(500, 100, 400, 350);
		shell.open();		
		
		Label labelMain = new Label (shell, SWT.NONE);
		labelMain.setText("Trainer");
		labelMain.setBounds(145, 75, 250, 20);
			
		Button addTrainer = new Button (shell, SWT.PUSH);
		addTrainer.setText("Add trainer");
		addTrainer.setBounds(125, 193, 150, 28);
		addTrainer.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				addTrainer();
			}
		});
		
		Button removeTrainer = new Button (shell, SWT.PUSH);
		removeTrainer.setText("Add trainer");
		removeTrainer.setBounds(125, 193, 150, 28);
		removeTrainer.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				removeTrainer(trainer);
			}
		});
		
		Button showExercise = new Button (shell, SWT.PUSH);
		showExercise.setText("Show exercise");
		showExercise.setBounds(125, 193, 150, 28);
		showExercise.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				showExercise();
			}
		});
		
		Button addExercise = new Button (shell, SWT.PUSH);
		addExercise.setText("Add exercise");
		addExercise.setBounds(125, 193, 150, 28);
		addExercise.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				addExercise(exercise);
			}
		});
		
		Button removeExercise = new Button (shell, SWT.PUSH);
		removeExercise.setText("Reamove exercise");
		removeExercise.setBounds(125, 193, 150, 28);
		removeExercise.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				removeExercise(exercise);
			}
		});
		
		Button showNutrition = new Button (shell, SWT.PUSH);
		showNutrition.setText("Show nutrition");
		showNutrition.setBounds(125, 193, 150, 28);
		showNutrition.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				showNutrition();
			}
		});
		
		Button addNutrition = new Button (shell, SWT.PUSH);
		addNutrition.setText("Add nutrition");
		addNutrition.setBounds(125, 193, 150, 28);
		addNutrition.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				addNutrition(nutrition);
			}
		});
		
		Button removeNutrition = new Button (shell, SWT.PUSH);
		removeNutrition.setText("Add nutrition");
		removeNutrition.setBounds(125, 193, 150, 28);
		removeNutrition.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				removeNutrition(nutrition);
			}
		});
	}
	
	public void setIdTicket(Long id) {
		idTicket = id;
	}
	
	public Long getIdTicket() {
		return idTicket;
	}
	
	public void setTrainer(Trainer tr) {
		trainer = tr;
	}
	
	public Trainer getTrainer() {
		return trainer;
	}
	
	public void setIdProgram(Long id) {
		idProgram = id;
	}
	
	public Long getIdProgram() {
		return idProgram;
	}
	
	public void setExercise(Excercise ex) {
		exercise = ex;
	}
	
	public Excercise getExercise() {
		return exercise;
	}
	
	public void setNutrition(Nutrition nutrition) {
		this.nutrition = nutrition;
	}
	
	public Nutrition getNutrition() {
		return nutrition;
	}
	
	public void setProgram(Program pr) {
		program = pr;
	}
	
	public Program getProgram() {
		return program;
	}
	
	public Trainer addTrainer() {
		return trainer;
	}
	
	public void removeTrainer(Trainer trainer) {}
	
	public List<Excercise> showExercise() {
		return exerciseList;
	}
	
	/*!*/
	public Excercise addExercise(Excercise ex) {
		exerciseList.add(ex);
		return ex;
	}
	
	public void removeExercise(Excercise ex) {
		exerciseList.remove(ex);
	}
	/*!*/
	public Nutrition showNutrition() {
		return nutrition;
	}
	
	/*!*/
	public Nutrition addNutrition(Nutrition nutrition) {
		nutritionList.add(nutrition);
		return nutrition;
	}
	
	public void removeNutrition(Nutrition nutrition) {
		nutritionList.remove(nutrition);
	}
}
