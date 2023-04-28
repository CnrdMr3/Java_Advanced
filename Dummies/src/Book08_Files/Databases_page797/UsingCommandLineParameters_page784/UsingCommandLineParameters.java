package Book08_Files.Databases_page797.UsingCommandLineParameters_page784;

/*
Ever since Book 1, Chapter 1, I’ve used this construction in every Java program
presented so far:
 */
public class UsingCommandLineParameters {
	public static void main(String[] args) {
		String s1 = "the quick brown fox";
		/*
		It’s high time that you find out what the args parameter of the main method
		is used for. The args parameter is an array of strings that lets you access any
		command-line parameters that are specified by the user when he or she runs your
		program.

		Suppose that you run a Java program named Test from a command program like
		this:

>>>>    C:\>java Test the quick brown fox

		In this case, the Java program is passed four parameters: the, quick, brown, and
		fox. You can access these parameters via the args array.

		Suppose that the main method of the Test class is written like this:
		 */
		{
		for (String s : args)
			System.out.println(s + " " + s1);  // Why is 's' not running?
	    }
	}
}
