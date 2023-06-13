package Book3_page235.Chapter06.EqualsMethod_page322.ComparingObjects;

/**
 * The type Test equality 2.
 */
public class TestEquality2 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        Employee emp2 = new Employee(
                "Martinez", "Anthony");
        if (emp1.equals(emp2))
            System.out.println(
                    "These employees are the same.");
        else
            System.out.println(
                    "These are different employees.");
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

	/**
	 * Gets last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
        return this.lastName;
    }

	/**
	 * Gets first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
        return this.firstName;
    }

	/**
	 * Equals boolean.
	 *
	 * @param obj the obj
	 * @return the boolean
	 */
// NOTE!!!
    public boolean equals(Object obj) {
        // an object must equal itself
        if (this == obj)
            return true;
        // no object equals null
        if (this == null)
            return false;
        // objects of different types are never equal
        if (this.getClass() != obj.getClass())
            return false;
        // cast to an Employee5, then compare the fields
        Employee emp = (Employee) obj;
        return this.lastName.equals(emp.getLastName())
                && this.firstName.equals(emp.getFirstName());
    }
}
