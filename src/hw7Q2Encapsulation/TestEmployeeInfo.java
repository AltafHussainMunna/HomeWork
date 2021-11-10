package hw7Q2Encapsulation;

public class TestEmployeeInfo {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Mark");
		employee.setAge(27);
		employee.setSex('M');
		employee.setUsCitizen(true);
		
		System.out.println(" Employee Full Name:" + employee.getName() + "\n Employee Age:" + employee.getAge()
		+ "\n Employee Sex: " + employee.getSex() + "\n Is this Employee Cinizen of USA ?  "
		+ employee.isUsCitizen());

	}

}
