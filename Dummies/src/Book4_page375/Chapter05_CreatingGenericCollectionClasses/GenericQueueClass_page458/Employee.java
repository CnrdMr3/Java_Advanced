package Book4_page375.Chapter05_CreatingGenericCollectionClasses.GenericQueueClass_page458;

/**
 * The type Employee.
 */
class Employee {
	/**
	 * The Last name.
	 */
	public String lastName;
	/**
	 * The First name.
	 */
	public String firstName;

	/**
	 * Instantiates a new Employee.
	 */
	public Employee() {
    }

	/**
	 * Instantiates a new Employee.
	 *
	 * @param last  the last
	 * @param first the first
	 */
	public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }

	/**
	 * To string string.
	 *
	 * @return the string
	 */
	public String toString() {
        return firstName + " " + lastName;
    }
}
