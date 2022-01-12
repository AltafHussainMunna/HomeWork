package hw9Q2Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	// This is an abstract method.
	public abstract void anatomyLab();

	// This is an Non-Abstract method.
	public void biochemistryLab() {

		System.out.println("This is a Biochemistry Lab");

	}
	public MedicalSchool() {
		System.out.println("This is the defult constructor for Medcal School.\n");
	}
	

}
