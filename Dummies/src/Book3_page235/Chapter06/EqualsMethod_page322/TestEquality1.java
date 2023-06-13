package Book3_page235.Chapter06.EqualsMethod_page322;

/**
 * The type Test equality 1.
 */
public class TestEquality1 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args)
    {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        Employee emp2 = new Employee(
                "Martinez", "Anthony");
        if (emp1 == emp2)
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
class Employee
{
    private String lastName;
    private String firstName;

	/**
	 * Instantiates a new Employee.
	 *
	 * @param lastName  the last name
	 * @param firstName the first name
	 */
	public Employee(String lastName, String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
