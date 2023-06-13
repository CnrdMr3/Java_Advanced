package Book3_page235.Chapter06.PrimitivesAreNotObjects.ToStringMethod.OverridingToString;


/**
 * The type Test to string override.
 */
public class TestToStringOverride {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Employee3 emp = new Employee3("Martinez",
                "Anthony");
        System.out.println(emp.toString());
    }
}

/**
 * The type Employee 3.
 */
class Employee3 {
    private String lastName;
    private String firstName;

	/**
	 * Instantiates a new Employee 3.
	 *
	 * @param lastName  the last name
	 * @param firstName the first name
	 */
	public Employee3(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

	/**
	 * To string string.
	 *
	 * @return the string
	 */
	public String toString()
    {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + "]";
    }
}
