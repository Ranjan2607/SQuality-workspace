import java.text.DecimalFormat;
public class EORSSale {

	public static void main(String[] args) {
		
		double product1 = 1200.23;
		double product2 = 1000.11;
		double product3 = 1350.45;
		double product4 = 1980.56;
		double product5 = 2140.12;
		
		System.out.println("==============================");
		System.out.println(">>Product1 Before Off: "+ product1);
		System.out.println(">>Product2 Before Off: "+ product2);
		System.out.println(">>Product3 Before Off: "+ product3);
		System.out.println(">>Product4 Before Off: "+ product4);
		System.out.println(">>Product5 Before Off: "+ product5);
		
		product1 = product1 - (0.4 * product1);
		product2 = product2 - (0.4 * product2);
		product3 = product3 - (0.4 * product3);
		product4 = product4 - (0.4 * product4);
		product5 = product5 - (0.4 * product5);
		System.out.println("==============================");
		
		DecimalFormat f = new DecimalFormat("##.00");
		
		System.out.println(">>Product1 After Off: "+ f.format(product1));
		System.out.println(">>Product2 After Off: "+ f.format(product2));
		System.out.println(">>Product3 After Off: "+ f.format(product3));
		System.out.println(">>Product4 After Off: "+ f.format(product4));
		System.out.println(">>Product5 After Off: "+ f.format(product5));
		System.out.println("==============================");
	}

}
