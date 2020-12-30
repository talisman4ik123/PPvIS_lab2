package data;

public class Excercise {

	private Long id;
	private String name;
	private String description;
	private String image;
	private int approachNum;
	private int doneAmount;
	private int dayNum;
	
	public Excercise() {
		id = 14546L;
		name = "";
		description = "";
		image ="";
		approachNum = 5;
		doneAmount = 3;
		dayNum = 1;
		
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setApproachNum(int approachNum) {
		this.approachNum = approachNum;
	}
	
	public int getApproachNum() {
		return approachNum;
	}
	
	public void setDoneAmount(int doneAmount) {
		this.doneAmount = doneAmount;
	}
	
	public int getDoneAmount() {
		return doneAmount;
	}
	
	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}
	
	public int getDayNum() {
		return dayNum;
	}
	
}
