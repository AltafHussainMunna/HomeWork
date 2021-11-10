package hw7Q3Abstraction;

public abstract class NursingSchool {

	// This is an Abstract method.
	public abstract void hygiene();

	//// This is an Non-Abstract method.
	public void caring() {

		System.out.println("This is Caring");

	}

	//NursingSchool nursingSchool = new NursingSchool();
	//An abstract class is a super class that cannot be instantiated (can’t create objects), so we can not create a constructor inside it.


}
