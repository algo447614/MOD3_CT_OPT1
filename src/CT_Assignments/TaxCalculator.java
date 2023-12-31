/*This program will calculate the weekly average tax withholding for a customer based on their weekly income, in the following tiers:
1.	Income less than $500: 10%
2.	Income between $500 and $1499: 15%
3.	Income between $1500 and $2499: 20%
4. Income $2500 and above: %30
*/

package CT_Assignments;
	import java.util.Scanner;

	public class TaxCalculator {
		public static void main(String[] args ) {
			System.out.println("This program will calculate weekly tax witholding based on income.");
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter weekly income: $");
			double income = scanner.nextDouble();
			
			double taxRate;
			   if (income < 500) {
		            taxRate = 0.10; // 10%
		        } else if (income < 1500) {
		            taxRate = 0.15; // 15%
		        } else if (income < 2500) {
		            taxRate = 0.20; // 20%
		        } else {
		            taxRate = 0.30; // 30%
		        }
			double taxWitholding = income * taxRate;
			System.out.println("Weekly tax witholding: $" + taxWitholding);
			
			scanner.close();
			System.out.println("Thank you for using this program.");
		}
	}
		   


