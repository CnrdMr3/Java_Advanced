package Book3_page235.Chapter04.DeterminingObjectType;

/**
 * The type Employee.
 */
public class Employee {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
       // Employee5 emp = getEmployee();
        Employee emp1 = new SalariedEmployee();
        Employee emp2 = new HourlyEmployee();
        String msg;
        if (emp1 instanceof SalariedEmployee) {
            msg = "The employee's salary is ";
            msg += ((SalariedEmployee) emp1).getFormattedSalary();
        } else {
            msg = "The employee's hourly rate is ";
            msg += ((HourlyEmployee) emp2).getFormattedRate();
        }
        System.out.println(msg);
    }
}
