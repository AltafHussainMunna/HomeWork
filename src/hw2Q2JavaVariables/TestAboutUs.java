package hw2Q2JavaVariables;

public class TestAboutUs {

	public static void main(String[] args) {
		AboutUs aboutUs1 = new AboutUs(); // constructor initialized
		aboutUs1.MyName = "Altaf"; // variables initialized from this line
		aboutUs1.myAge = 22;
		aboutUs1.myHouseRent = 10000;
		aboutUs1.myYearlySalary = 100000;
		aboutUs1.myBankBalance = 123456789012l;
		aboutUs1.mySex = 'M';
		aboutUs1.myHeight = 5.06f;
		aboutUs1.myGrade = 4.23434234512;
		aboutUs1.usCitizen = true;
		aboutUs1.aboutUs(); // method initialized
		
		System.out.println("\n***********************************\n");
		
		AboutUs aboutUs2 = new AboutUs();
		aboutUs2.MyName = "Alex"; // variables initialized from this line
		aboutUs2.myAge = 26;
		aboutUs2.myHouseRent = 20000;
		aboutUs2.myYearlySalary = 200000;
		aboutUs2.myBankBalance = 134556989013l;
		aboutUs2.mySex = 'M';
		aboutUs2.myHeight = 5.08f;
		aboutUs2.myGrade = 3.23434234512;
		aboutUs2.usCitizen = false;
		aboutUs2.aboutUs(); // method initialized

		
			
		}
		

	}
// commit by lobid

