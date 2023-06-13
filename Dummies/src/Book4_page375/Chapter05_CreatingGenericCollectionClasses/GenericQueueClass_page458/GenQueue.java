package Book4_page375.Chapter05_CreatingGenericCollectionClasses.GenericQueueClass_page458;

import java.util.LinkedList;

/**
 * The type Gen queue.
 *
 * @param <E> the type parameter
 */
public class GenQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();

	/**
	 * Enqueue.
	 *
	 * @param item the item
	 */
	public void enqueue(E item) {
        list.addLast(item);
    }

	/**
	 * Dequeue e.
	 *
	 * @return the e
	 */
	public E dequeue() {
        return list.poll();
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

	/**
	 * Add items.
	 *
	 * @param q the q
	 */
	public void addItems(GenQueue<? extends E> q) {
        while (q.hasItems())
            list.addLast(q.dequeue());
    }
}
