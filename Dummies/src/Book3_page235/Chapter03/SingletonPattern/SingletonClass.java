package Book3_page235.Chapter03.SingletonPattern;

/**
 * The type Singleton class.
 */
public class SingletonClass {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();

        if (s1 != s2)
            System.out.println("The objects are the same");
        else
            System.out.println("The objects are not the same");
    }

    private static SingletonClass instance;

    private SingletonClass() {
    }

	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static SingletonClass getInstance() {
        if (instance == null)
            instance = new SingletonClass();
        return instance;
    }
}
