package hw5Q2JavaConditionalStatement;

public class CompareNumber08 {

	public static void main(String[] args) {
		int ageOfAlex = 21;
		int ageOfJenifer = 21;

		if (ageOfAlex % 2 == 0 && ageOfAlex < ageOfJenifer) {
			System.out.println(ageOfJenifer + " whic is an even number and less than " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 0 && ageOfAlex > ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an even number and greater than " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 1 && ageOfAlex < ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an odd number and less than " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 1 && ageOfAlex > ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an odd number and greater than " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 0 && ageOfAlex != ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an even number and not equal to " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 0 && ageOfAlex == ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an even number and equal to " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 1 && ageOfAlex != ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an odd number and not equal to " + ageOfJenifer);
		} else if (!(ageOfAlex % 2 == 1 && ageOfAlex == ageOfJenifer)) {
			System.out.println(ageOfAlex + " which is not an off number and not equal to " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 0 && ageOfAlex >= ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an even number and greater than (or equal to)  " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 0 && ageOfAlex <= ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an even number and less than (or equal to) " + ageOfJenifer);
		} else if (ageOfAlex % 2 == 1 && ageOfAlex == ageOfJenifer) {
			System.out.println(ageOfAlex + " which is an odd number and equal to " + ageOfJenifer);
		}

	}

}
