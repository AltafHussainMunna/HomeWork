package hw9Q2Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	// This is an Abstract method-
	// In a Regular Class we cannot declare/define abstract methods we can ONLY implement them.
	// public abstract void math();

	public  void statistics() {
		System.out.println("This is the Statistics Class.");
	} // In a regular class we can only implement non-abstract methods.

	public RockefellerUniversity() {
		System.out.println("This is the default constructor for Rockefeller University Class.\n");
	}

	public static void main(String[] args) {
		RockefellerUniversity rockefellerUniversity = new RockefellerUniversity(); // The class is instantiated
		rockefellerUniversity.statistics(); // The method is called from the object.

	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("areonauticalInfo method is from AreoNauticalSchool Interface.");
		
	}

	@Override
	public void mechanicalLab() {
		System.out.println("mechanicalLab method is from EngineeringSchool Abstract Class.");
		
	}

}
