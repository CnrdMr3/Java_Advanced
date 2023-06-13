package Book3_page235.Chapter06.ObjectAsType;

/**
 * The type Object.
 */
public class Object {
    private java.lang.Object lastName;

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Employee emp = new Employee();
        ((Employee)emp).setLastName("Smith");
    }

	/**
	 * Sets last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(java.lang.Object lastName) {
        this.lastName = lastName;
    }
}
