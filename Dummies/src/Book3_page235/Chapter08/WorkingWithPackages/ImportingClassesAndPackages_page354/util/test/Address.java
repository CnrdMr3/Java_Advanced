package Book3_page235.Chapter08.WorkingWithPackages.ImportingClassesAndPackages_page354.util.test;

/**
 * The type Address.
 */
class Address implements Cloneable {
    private String street;
    private String city;
    private String state;
    private String zipCode;

	/**
	 * Instantiates a new Address.
	 */
	public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

	/**
	 * Instantiates a new Address.
	 *
	 * @param street  the street
	 * @param city    the city
	 * @param state   the state
	 * @param zipCode the zip code
	 */
	public Address(String street, String city,
                   String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

	/**
	 * Clone object.
	 *
	 * @return the object
	 */
	public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
    }

	/**
	 * Gets address.
	 *
	 * @return the address
	 */
	public String getAddress() {
        return this.street + "\n"
                + this.city + ", "
                + this.state + " "
                + this.zipCode;
    }
}
