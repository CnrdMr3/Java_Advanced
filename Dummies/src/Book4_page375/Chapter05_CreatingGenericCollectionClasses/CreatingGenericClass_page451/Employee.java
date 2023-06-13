package Book4_page375.Chapter05_CreatingGenericCollectionClasses.CreatingGenericClass_page451;

/**
 * The type Employee.
 *
 * @param <E> the type parameter
 */
public class Employee<E> extends ArrayList{
    private E o;

	/**
	 * Add boolean.
	 *
	 * @param o the o
	 * @return the boolean
	 */
	public boolean add(E o)
    {
        this.o = o;
// body of method omitted (thank you)
        return false;
    }

	/**
	 * Get e.
	 *
	 * @param index the index
	 * @return the e
	 */
	public E get(int index)
    {
// body of method omitted (you're welcome)
        return null;
    }

	/**
	 * Clone object.
	 *
	 * @return the object
	 */
	public Object clone()
    {
        try
        {
            ArrayList v = (ArrayList) super.clone();
            int size = 0;
            v.setElementData(new Object[size]);
            System.arraycopy(getElementData(), 0,
                    v.getElementData(), 0, size);
            v.modCount = 0;
            return v;
        }
        catch (CloneNotSupportedException e)
        {
// this shouldn't happen since we're Cloneable
            throw new InternalError();
        }
    }

	/**
	 * Gets o.
	 *
	 * @return the o
	 */
	public E getO() {
        return o;
    }

	/**
	 * Sets o.
	 *
	 * @param o the o
	 */
	public void setO(E o) {
        this.o = o;
    }
}
