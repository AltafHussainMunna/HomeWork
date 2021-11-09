package hw6Q3Abstraction;

public interface College {

	public void commonRoom();

	public void laboratroy();

	public void languageClub();

	//College college = new College();
	
	 //Q: Can you create a Constructor inside the interface?
	// A: NO, Interface cannot be instantiated (cannot create object), so we can not create a constructor inside it.

}
