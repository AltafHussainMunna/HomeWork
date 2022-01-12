package hw9Q2Abstraction;

public interface College {

	public void commonRoom();

	public void laboratroy();

	public void languageClub();

	// College college = new College();

	// Q: Can you create a Constructor inside the interface?
	// A: NO, Interface cannot be instantiated (cannot create object), so we can not
	// create a constructor inside it.

	public default void dorm() {// This is default method, which is implemented here because of using default
								// keyword.

	}

	public static void studyRoom(){//This is  static method, which is implemented here because of using static keyword.



	
	}
	/* how many keywords are used for the inheritance in Interface, answer by Java comments? 
	 * 2, extend and implements
	 
	 * Can an interface inherit other Interface, or a regular class or abstract class? 
	 * yes Interface can but not regular or abstract class
	 
	 * How many inheritance is possible? Use the Interface --"University" to answer my questions (by multiple line comments).
	   * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool.
	 
	 * how many keywords are used for the inheritance in Java for Abstract Class?
	 * 
	 * Can an Abstract Class inherit other Abstract Class or a regular class or interface? 
	 * YES, Only one abstract or regular class.

	 * 
	 * How many inheritances is possible by an Abstract Class? 
	 * Only one abstract or regular class and multiple Interface.
	 * 
	 * Use the all of above Abstract Classes and use the keywords to answer my questions.
	 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. 
	 * 
	 * how many keywords are used for the inheritance in Java for a regular Class? 
	 * 
	 * Can an regular Class inherit other Abstract Class or a regular class or interface? 
	 * yes
	 * 
	 * How many inheritances is possible by a regular Class?
	 * Only one.
	  
	 * Use the all of above regular Classes and use the keywords to answer my questions. 
	 * You don't need to execute anything as the main method is absent.
	 * Paste your package github link below. 50 points
	 */


}