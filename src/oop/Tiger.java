package oop;

public class Tiger extends Animal{

	private int stripes = 10;
	
	public void animalSound() {
		System.out.println("GRRRRR");
	}

	public static void main(String[] args) {
		Tiger tg = new Tiger();
		tg.setName("Danger");
		tg.setCategory("LightWeight");
		System.out.println(tg.getName() + tg.petName + tg.stripes);
		tg.animalSound();
		Animal aa = new Animal();
		aa.animalSound();
	}
}
