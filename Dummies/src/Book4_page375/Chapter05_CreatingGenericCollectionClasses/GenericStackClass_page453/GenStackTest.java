package Book4_page375.Chapter05_CreatingGenericCollectionClasses.GenericStackClass_page453;

/**
 * The type Gen stack test.
 */
public class GenStackTest {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        GenStack<String> gs = new GenStack<>();
        System.out.println("Pushing four items onto the stack.");

        gs.push("One");
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");

        System.out.println("There are " + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: " + gs.peek() + "\n");
        System.out.println("There are still " + gs.size() + " items in the stack.\n");

        System.out.println("Popping everything:");

        while (gs.hasItems())
            System.out.println(gs.pop());

        System.out.println("There are now " + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: " + gs.peek() + "\n");
    }
}
