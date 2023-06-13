package Book5_page475.Chapter01_ImplementingRunnableInterface_page480;

/**
 * The type Runnable class.
 */
class RunnableClass {
	/**
	 * The Rc.
	 */
	RunnableClass rc = new RunnableClass();
	/**
	 * The T.
	 */
	Thread t = new Thread((Runnable) rc);

	/**
	 * Gets t.
	 *
	 * @return the t
	 */
	public Thread getT() {
        t.start();
        return t;
    }
}
