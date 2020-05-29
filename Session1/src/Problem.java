
public class Problem {

	public static void main(String[] args) {
		//MVC 
		
		//1. Model: Data
		//int is a storage container to store integers
		int day1Sales = 1764;
		int day2Sales = 3256;
		int day3Sales = 9087;
		
		//double is a storage container to store decimal values
		double packPrice = 315.67;
		double profit = 12.97;
		char ch = '₹';
		//3. Controller
		// Defining Logic for us
		// Computation
		double totalSales = (day1Sales + day2Sales + day3Sales) * packPrice;
		double totalProfit = (day1Sales + day2Sales + day3Sales) * profit;

		//2. View or UI
		System.out.println(">>Total Sales in 3 days: "+ ch + totalSales);
		System.out.println(">>Total Profits in 3 days: "+ ch + totalProfit);
		
		
	}

}
