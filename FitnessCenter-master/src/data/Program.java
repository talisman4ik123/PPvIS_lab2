package data;

public class Program {

	private Long id;
	private Long nutritionId;
	private Long excerciseId;
	private int excerciseWeekNum;
	private Nutrition nutrition;
	private Excercise exercise;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setNutritionId(Long id) {
		nutritionId = id;
	}
	
	public Long getNutritionId() {
		return nutritionId;
	}
	
	public void setExcerciseId(Long id) {
		excerciseId = id;
	}
	
	public Long getExcerciseId() {
		return excerciseId;
	}
	
	public void setExcerciseWeekNum(int num) {
		excerciseWeekNum = num;
	}
	
	public int getExcerciseWeekNum() {
		return excerciseWeekNum;
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
	public Program getProgram() {
		return null;
	}
	
}
