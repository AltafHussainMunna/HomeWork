package hw3Q4Constructor;

public class TestStudent {
	public static void main(String[] args) {
		Student student = new Student();

		Student student1 = new Student("Munna", 22134, 'M', true, 3.976f); // Here parameterized constructor is
																			// initialized
		System.out.println(
				"\n-------------------------------------------------------------------------------------------------------------------\n");

		Student student2 = new Student("Amanda", 242825, 'F', false, 2.538f); // Here parameterized constructor is
																			// initialized

		System.out.println(
				"\n-------------------------------------------------------------------------------------------------------------------\n");

		student.student("Alex", 742729, 'M', true, 3.659f); // Here Parameterized method is initialized

	}

}
