package Book3_page235.Chapter07.UsingAnonymousInnerClasses_page347.CreatingAnAnonymousClass;

/*
The basic form for declaring and instantiating an anonymous class is this:

    new ClassOrInterface() { class-body }

1. new keyword followed by the name of a class or interface that specifies
   the type of the object created from the anonymous class.

2. This class or interface name is followed by parentheses, which may include a parameter
   list that’s passed to the constructor of the anonymous class.
 */

/**
 * The type Anon class.
 */
public class AnonClass {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        Ball b = new Ball() {
            public void hit() {
                System.out.print("You hit it!");
            }
        };
        b.hit();
    }

	/**
	 * The interface Ball.
	 */
	interface Ball {
		/**
		 * Hit.
		 */
		void hit();
    }
}
