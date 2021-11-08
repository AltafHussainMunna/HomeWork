package hw6Q3nheritance;

public class NYUniversity {

	// This is an Abstract method-
    // In a Regular Class we cannot declare/define abstract methods we can ONLY implement them.
	// public abstract void anthropology();

	public void physics() {
		System.out.println("This is the Physic's Class.");
	} // In a regular class we can only implement non-abstract methods.

	public NYUniversity() {
		System.out.println("This is the default constructor for NY University Class.\n");
	}// This is the Default Constructor.

	public static void main(String[] args) {
		NYUniversity nyUniversity = new NYUniversity(); // The class is instantiated.
		nyUniversity.physics(); // The method is called from the object.

	}

}
