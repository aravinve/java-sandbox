package oop;

public class Animal {

	private String name;
	private String category;
	protected String petName;
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setName(String name) {
		this.name = name;
		this.petName = name + "MyFav";
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void animalSound() {
		System.out.println("Silence");
	}
}
