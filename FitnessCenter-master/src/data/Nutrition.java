package data;

public class Nutrition {

	private String id;
	private String name;
	private String breakfastDescription;
	private String lunchDescription;
	private String dinnerDescription;
	
	public Nutrition() {
		id ="";
		name ="";
		breakfastDescription = "";
		lunchDescription = "";
		dinnerDescription = "";
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setBreakfastDescription(String breakfastDescription) {
		this.breakfastDescription = breakfastDescription;
	}
	public String getBreakfastDescription() {
		return breakfastDescription;
	}
	
	public void setLunchDescription(String lunchDescription) {
		this.lunchDescription = lunchDescription;
	}
	public String getLunchDescription() {
		return lunchDescription;
	}
	
	public void setDinnerDescription(String dinnerDescription) {
		this.dinnerDescription = dinnerDescription;
	}
	public String getDinnerDescription() {
		return dinnerDescription;
	}
	
}
