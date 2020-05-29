import java.text.DecimalFormat;
public class EORSSaleOptimized {

	public static void main(String[] args) {
		double[] products = {1200.23, 1000.11, 1350.45, 1980.56, 2140.12};
		DecimalFormat f = new DecimalFormat("##.00");
		
		for(int i=0; i<products.length; i++) {
			System.out.println("Products values without OFF for idx value " + i + " is " + f.format(products[i]));
			products[i] = products[i] - (0.4 * products[i]);
		}

		for(int i=0; i<products.length; i++) {
			System.out.println("Products values after OFF for idx value " + i + " is " + f.format(products[i]));
		
		}
	}

}
