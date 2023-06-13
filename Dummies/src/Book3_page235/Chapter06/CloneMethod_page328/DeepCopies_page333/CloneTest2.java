package Book3_page235.Chapter06.CloneMethod_page328.DeepCopies_page333;

//Creating a Deep Copy:

/**
 * The type Clone test 2.
 */
public class CloneTest2 {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        emp1.setSalary(40000.0);
        emp1.address = new Address(
                "1300 N. First Street",
                "Fresno", "CA", "93702");
        Employee emp2 = (Employee) emp1.clone();
        System.out.println(
                "**** after cloning ****\n");
        printEmployee(emp1);
        printEmployee(emp2);
        emp2.setLastName("Smith");
        emp2.address = new Address(
                "2503 N. 6th Street",
                "Fresno", "CA", "93722");
        System.out.println(
                "**** after changing emp2 ****\n");
        printEmployee(emp1);
        printEmployee(emp2);
    }
    //Clones the employee (okay, just the object, not the co-worker).

    private static void printEmployee(Employee e) {
        System.out.println(e.getFirstName()
                + " " + e.getLastName());
        System.out.println(e.address.getAddress());
        System.out.println("Salary: " + e.getSalary());
        System.out.println();
    }
}

/**
 * The type Employee.
 */
//The Employee5 class. Notice that this class implements Cloneable.
class Employee implements Cloneable {
    private String lastName;
    private String firstName;
    private Double salary;
	/**
	 * The Address.
	 */
	public Address address;

	/**
	 * Instantiates a new Employee.
	 *
	 * @param lastName  the last name
	 * @param firstName the first name
	 */
//The address field, which holds an object of type Address.
    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
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
	 * Sets last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(String lastName) {
        this.lastName = lastName;
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
	 * Sets first name.
	 *
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

	/**
	 * Gets salary.
	 *
	 * @return the salary
	 */
	public Double getSalary() {
        return this.salary;
    }

	/**
	 * Sets salary.
	 *
	 * @param salary the salary
	 */
	public void setSalary(Double salary) {
        this.salary = salary;
    }

	/**
	 * Clone object.
	 *
	 * @return the object
	 */
//The clone method in the Employee5 class.
    public Object clone() {
        Employee emp;
        try {
            emp = (Employee) super.clone(); //Creates a shallow copy of the Employee5 object.
            emp.address = (Address) address.clone();
            /*Creates a shallow copy of the Address object and assigns it to the
            address field of the cloned Employee5 object.*/
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp; //Returns the cloned Employee5 object.
    }
    /*
    Catches CloneNotSupportedException, which won’t ever happen
    because the class implements Cloneable. The compiler requires the
    try/catch statement here because CloneNotSupportedException is
    a checked exception.
     */

	/**
	 * To string string.
	 *
	 * @return the string
	 */
	public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " " + this.lastName + ", "
                + this.salary + "]";
    }
}

/**
 * The type Address.
 */
class Address implements Cloneable {
    private String street;
    private String city;
    private String state;
    private String zipCode;

	/**
	 * Instantiates a new Address.
	 */
	public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

	/**
	 * Instantiates a new Address.
	 *
	 * @param street  the street
	 * @param city    the city
	 * @param state   the state
	 * @param zipCode the zip code
	 */
	public Address(String street, String city,
                   String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

	/**
	 * Clone object.
	 *
	 * @return the object
	 */
	public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
    }
    /*
    Catches CloneNotSupportedException, which won’t ever happen
    because the class implements Cloneable. The compiler requires the
    try/catch statement here because CloneNotSupportedException is
    a checked exception.
     */

	/**
	 * Gets address.
	 *
	 * @return the address
	 */
	public String getAddress() {
        return this.street + "\n"
                + this.city + ", "
                + this.state + " "
                + this.zipCode;
    }
}
