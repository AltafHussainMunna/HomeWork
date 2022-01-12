package hw9Q2Abstraction;

public abstract class EngineeringSchool extends NYUniversity{

	// This is an Abstract method.
	public abstract void mechanicalLab();

	// This is an Non-Abstract method.
	public void computerLab() {

		System.out.println("This is Computer Lab");

	}
	public EngineeringSchool() {
		System.out.println("This is the defult constructor for Engineering School Class.\n");
	}

}
