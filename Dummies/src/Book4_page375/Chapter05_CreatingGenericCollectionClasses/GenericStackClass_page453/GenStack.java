package Book4_page375.Chapter05_CreatingGenericCollectionClasses.GenericStackClass_page453;

import java.util.LinkedList;

/**
 * The type Gen stack.
 *
 * @param <E> the type parameter
 */
public class GenStack<E> {
    private LinkedList<E> list = new LinkedList<E>();

	/**
	 * Push.
	 *
	 * @param item the item
	 */
	public void push(E item) {
        list.addFirst(item);
    }

	/**
	 * Pop e.
	 *
	 * @return the e
	 */
	public E pop() {
        return list.poll();
    }

	/**
	 * Peek e.
	 *
	 * @return the e
	 */
	public E peek() {
        return list.peek();
    }

	/**
	 * Has items boolean.
	 *
	 * @return the boolean
	 */
	public boolean hasItems() {
        return !list.isEmpty();
    }

	/**
	 * Size int.
	 *
	 * @return the int
	 */
	public int size() {
        return list.size();
    }
}
