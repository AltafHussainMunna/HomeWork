package hw1Q2JavaBsics;

public class My_address {
	
		public static String MyName = "Altaf Munna";	
		public static int houseNumber = 2217;	
		public static char houseLocation = 'E';
		public static String streetName= "Lyon";
		public static String streetType = " Avenue";
		public static String state = "NY -";
		public static int zipCode = 10462;	
		public static boolean inUSA = true;	
		
		public My_address() {		
		}
		
		public static void myAddress() { 
			System.out.println(MyName+"\n"+houseNumber+houseLocation+" "+streetName+streetType+"\n"+state+zipCode);
			System.out.println("Is the adress is in USA? Ans: "+inUSA);
		}	
		
		public static void main(String[] args) { 
			myAddress(); 
		}


}
