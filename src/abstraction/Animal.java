package abstraction;

public class Animal {

	int age;
	String gender;
	int weightInLbs;
	
	public Animal(int age, String gender, int weightInLbs) {
		this.age = age;
		this.gender = gender;
		this.weightInLbs= weightInLbs;
	}
	
	protected void eat() {
		System.out.println("Eating...");
	}
	
	protected void sleep() {
		System.out.println("Sleeping...");
	}
	
}
