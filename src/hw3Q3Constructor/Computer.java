package hw3Q3Constructor;
//

//
public class Computer {

	String brand;
	String model;
	String operatingSystem;
	int price;
	boolean madeInUSA;
	char grade;
	
    public Computer() {
    	System.out.println("This is from default Constructor of Computer class");

	}

	public Computer(String brand, String model, String opersatingSyString, int price, boolean madeInUSA, char grade) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = opersatingSyString;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		
		System.out.println("Brand Name is: " + brand + "\nModel: " + model + "\nOerating system: " + operatingSystem
				+ "\nPrice" + price + "\nMadeInUSA: " + madeInUSA + "\nGrade: " + grade);
		

	}

}
