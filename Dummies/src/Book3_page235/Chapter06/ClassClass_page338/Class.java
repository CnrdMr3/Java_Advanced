package Book3_page235.Chapter06.ClassClass_page338;

import java.lang.*;

/**
 * The type Class.
 */
public class Class {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Employee emp = new Employee();
        java.lang.Class c = emp.getClass();
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        emp1.setSalary(40000.0);
        Employee emp2 = (Employee) emp1.clone();
        emp1.setLastName("Smith");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}

/**
 * The type Employee.
 */
class Employee {
    private String lastName;
    private String firstName;
    private Double salary;

	/**
	 * Instantiates a new Employee.
	 *
	 * @param lastName  the last name
	 * @param firstName the first name
	 */
	public Employee(String lastName,
                    String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

	/**
	 * Instantiates a new Employee.
	 */
	public Employee() {

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
	public Object clone() {
        Employee emp;
        emp = new Employee(
                this.lastName, this.firstName);
        emp.setSalary(this.salary);
        return emp;
    }

	/**
	 * To string string.
	 *
	 * @return the string
	 */
	public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}
