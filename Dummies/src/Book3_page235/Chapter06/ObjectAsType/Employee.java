package Book3_page235.Chapter06.ObjectAsType;

/**
 * The type Employee.
 */
public class Employee extends Person {
	/**
	 * Instantiates a new Employee.
	 *
	 * @param addams the addams
	 * @param gomez  the gomez
	 */
	public Employee(String addams, String gomez) {

    }

	/**
	 * Instantiates a new Employee.
	 */
	public Employee() {

    }

	/**
	 * Change name.
	 *
	 * @param robert the robert
	 */
	public void changeName(String robert) {
    }

	/**
	 * Sets last name.
	 *
	 * @param smith the smith
	 */
	public void setLastName(String smith) {
    }
    /* If the Employee5 class has a method named
       setLastName, the following code doesn't work:

       Object emp = new Employee5();
       emp.setLastName("Smith"); // error: won't compile

       Because emp is an Object, not an Employee5, the compiler doesn't know about the
       setLastName method.
     */

    // Note that you could still cast the object to an Employee5:

}
