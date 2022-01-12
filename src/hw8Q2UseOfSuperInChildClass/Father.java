package hw8Q2UseOfSuperInChildClass;

public class Father {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String famillyName;

	public Father() {
		System.out.println("This is a default constructor of Father class");

	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		super();
		Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father name: " + name + ", Age: " + age + ", Sex: " + sex + ", US Citizen?: " + usCitizen);

	}

	public void father() {
		System.out.println("This is the void type method from Father Class.");
	}

	public void fatherinfo(String name, int age, char sex, boolean usCitizen) { // Parameterized Method
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("Father name: " + name + ", Age: " + age + ", Sex: " + sex + ", US Citizen?: " + usCitizen);

	}
}
