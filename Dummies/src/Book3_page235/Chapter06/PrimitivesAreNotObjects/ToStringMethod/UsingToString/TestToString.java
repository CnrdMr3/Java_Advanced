package Book3_page235.Chapter06.PrimitivesAreNotObjects.ToStringMethod.UsingToString;

/**
 * The type Test to string.
 */
public class TestToString {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Employee emp = new Employee("Martinez",
                "Anthony");
        System.out.println(emp.toString());
    }
}

/**
 * The type Employee.
 */
class Employee {
    private String lastName;
    private String firstName;

	/**
	 * Instantiates a new Employee.
	 *
	 * @param lastName  the last name
	 * @param firstName the first name
	 */
	public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}

// Note: The hash code — in this case, 82ba41 — will undoubtedly be different on your system.
// My system - Employee5@49e4cb85.