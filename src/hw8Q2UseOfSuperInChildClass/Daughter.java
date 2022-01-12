package hw8Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthName;
	public int age;

	public Daughter() {
		super("Arnold", 47, 'M', false);
		super.father();
		super.fatherinfo("Alana", 42, 'F', usCitizen);
		super.famillyName = "Arnold";
		System.out.println("The family name here is: \" + FamilyName");
		System.out.println("This is the default constructor from Daughter Class");
		System.out.println("\n");

	}

	public Daughter(String birthMonth, int age) {
		super();
		super.father();
		super.fatherinfo("Bobi", 44, 'M', true);
		super.famillyName = "Bobi";
		System.out.println("The family name here is: + FamilyName");
		System.out.println("Daughter Birth Month: " + birthMonth + ", Age: " + age);
		System.out.println("\n");
	}

	public void daughter() {
		super.father();
		super.fatherinfo("Morgan", 51, 'M', false);
		super.famillyName = "Morgan";
		System.out.println("The family name here is: " + famillyName);
		System.out.println("This is the void type method from Daughter Class.");
		System.out.println("\n");
	}

	public void daughterinfo(String birthMonth, int age) { // Parameterized Method
		super.father();
		super.fatherinfo("Aronl", 88, 'M', true);
		super.famillyName = "Aronl";
		System.out.println("The family name here is: " + famillyName);
		System.out.println("Daughter Birth Month: " + birthMonth + ", Age: " + age);
	}

}
