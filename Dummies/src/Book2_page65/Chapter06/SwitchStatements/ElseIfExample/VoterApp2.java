package Book2_page65.Chapter06.SwitchStatements.ElseIfExample;

import java.util.Scanner;

/**
 * The type Voter app 2.
 */
public class VoterApp2 {
	/**
	 * The Sc.
	 */
	static Scanner sc = new Scanner(System.in);

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        System.out.println
                ("Welcome to the voting machine "
                        + "error code decoder.\n\n"
                        + "If your voting machine generates "
                        + "an error code,\n"
                        + "you can use this program to determine "
                        + "the exact\ncause of the error.\n");
        System.out.print("Enter the error code: ");

        int err = sc.nextInt();
        String msg;
        switch (err)
        {
            case 1:
                msg = "Voter marked more than one "
                        + "candidate.\nBallot rejected.";
                break;
            case 2:
                msg = "Box checked and write-in candidate "
                        + "entered.\nBallot rejected.";
                break;
            case 3:
                msg = "Entire ballot was blank.\n"
                        + "Ballot filled in according to "
                        + "secret plan.";
                break;
            case 4:
                msg = "Nothing unusual about the ballot.\n"
                        + "Voter randomly selected for tax audit.";
                break;
            case 5:
                msg = "Voter filled in every box.\n"
                        + "Ballot counted twice.";
                break;
            case 6:
                msg = "Voter drooled in voting machine.\n"
                        + "Beginning spin cycle.";
                break;
            case 7:
                msg = "Voter lied to pollster after voting.\n"
                        + "Voter's ballot changed "
                        + "to match polling data.";
                break;
            default:
                msg = "Voter filled out ballot correctly.\n"
                        + "Ballot discarded anyway.";
                break;
        }
        System.out.println(msg);
    }
}

// Used switch-statement (break avoiding infinite-loop).
