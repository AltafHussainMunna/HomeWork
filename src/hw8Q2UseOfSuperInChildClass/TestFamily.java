package hw8Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		Daughter daughter = new Daughter();
		Daughter daughter2 = new Daughter("March", 28);
		daughter.daughter();
		daughter.daughterinfo("July", 25);

		System.out.println("\n-----------------------------------");

		Father father = new Father();
		Father father2 = new Father("Stanly", 65, 'M', true);
		father.father();
		father.fatherinfo("Mik", 46, 'M', false);

	}

}
