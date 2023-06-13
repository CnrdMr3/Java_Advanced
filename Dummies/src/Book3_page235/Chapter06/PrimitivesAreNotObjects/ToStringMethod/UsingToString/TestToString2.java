package Book3_page235.Chapter06.PrimitivesAreNotObjects.ToStringMethod.UsingToString;

/**
 * The type Test to string 2.
 */
public class TestToString2 {
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
 * The type Employee 2.
 */
class Employee2 {
    private String lastName;
    private String firstName;

	/**
	 * Instantiates a new Employee 2.
	 *
	 * @param lastName  the last name
	 * @param firstName the first name
	 */
	public Employee2(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

	/**
	 * To string string.
	 *
	 * @return the string
	 */
	public String toString() {
        return "Employee5["
                + this.firstName + " "
                + this.lastName + "]";
    }
}

