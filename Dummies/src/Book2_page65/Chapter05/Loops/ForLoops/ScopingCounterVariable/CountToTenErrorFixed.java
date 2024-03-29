package Book2_page65.Chapter05.Loops.ForLoops.ScopingCounterVariable;

/*
public class CountToTenError{
 public static void main(String[] args){

 for (int i = 1; i <=10; i++)

 System.out.println(i);

 System.out.println("The final value of i is " + i);
 }
}

You can use the
variable in the other expressions that appear within the parentheses and in the
body of the loop, but you can’t use it outside the loop.
 */

/**
 * The type Count to ten error fixed.
 */
public class CountToTenErrorFixed {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        int i;

        for (i = 1; i <=10; i++)
            System.out.println(i);
        System.out.println("The final value of i is " + i);
    }
}