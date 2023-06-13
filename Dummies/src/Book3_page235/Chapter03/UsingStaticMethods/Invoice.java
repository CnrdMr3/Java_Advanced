package Book3_page235.Chapter03.UsingStaticMethods;

/**
 * The type Invoice.
 */
public class Invoice {
    private static double taxRate = 0.75;
    private double salesTotal;

	/**
	 * Gets tax.
	 *
	 * @return the tax
	 */
	public double getTax() {
        return salesTotal * taxRate;
    }
}

//Here the instance method named salesTotal has no trouble accessing the static
//field taxRate.