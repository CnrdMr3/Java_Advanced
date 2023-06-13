package Book2_page65.Chapter04.MakingChoices.ComparingStrings;

/**
 * The type Comparing strings.
 */
public class ComparingStrings {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        String answer = "Yes";
        String input = "End";

        //Use .equals():
        if (answer.equals("Yes"))
            System.out.println("The answer is Yes.");

        //Input case is ignored, could also be "END" or "End":
        if (input.equalsIgnoreCase("end"));
        // end the program
        System.out.println(input + " " + answer);
    }
}
