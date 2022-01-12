package hw8Q3Abstraction;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ColumbiaUniversity {

	// This is an Abstract method.
	// In a Regular Class we cannot declare/define abstract methods we can ONLY implement them.
	// public abstract void chemistry();

	// This a Non-Abstract method.
	// In a regular class we can only implement non-abstract methods.
	public void biology() {

		System.out.println("This is Biology Class");

	}

	public ColumbiaUniversity() {
		System.out.println("This is defult constuctor of ColumbiaUniversity Class");
	}

	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity(); // The class is instantiated
		columbiaUniversity.biology(); // The method is called from the object.
	}

}
