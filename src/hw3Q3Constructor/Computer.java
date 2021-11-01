package hw3Q3Constructor;

public class Computer {
	public String MyBrand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public Computer() {

		System.out.println("This is from default Constructor of Computer class: \n");

	}

	// parameterized constructor 1
	public Computer(String MyBrand) {
		this.MyBrand = MyBrand;

		System.out.println("My Brand: " + MyBrand);

	}

	// parameterized constructor 2
	public Computer(int price, boolean madeInUSA, char grade) {
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		System.out.println("Price: " + price + ", Made in the USA? Ans: " + madeInUSA + ", Grade: " + grade);

	}

	// parameterized constructor 3
	public Computer(boolean madeInUSA, char grade, int price, String Model, String MyBrand) {
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		this.price = price;
		this.Model = Model;
		this.MyBrand = MyBrand;
		System.out.println("Made in the USA? Ans: " + madeInUSA + ", Grade: " + grade + ", Price: " + price
				+ ", Model: " + Model + ", Brand: " + MyBrand);

	}

	// parameterized constructor 4
	public Computer(String MyBrand, String Model, String OperatingSystem, int price, char grade, boolean madeInUSA) {
		this.MyBrand = MyBrand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + MyBrand + ", Model: " + Model + ", Operating System: " + OperatingSystem
				+ ", Price: " + price + ", Grade: " + grade + ", Made in the USA?: " + madeInUSA);

	}

}
