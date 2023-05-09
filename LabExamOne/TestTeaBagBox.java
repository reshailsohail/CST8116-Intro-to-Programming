
/*
 * Student Name: Reshail Sohail
 * Lab Professor: Wafa Hasanain
 * Due Date: October 13, 2022
 * Modified: Oct 13, 2022
 * Description: Lab Exam 1  
 */

import java.util.Scanner;

/*
 * This class is used to test the TeaBagBox class
 */


public class TestTeaBagBox {

	/*
	 * Main method asks for inputs of two values which are set into each instance for TeaBagBox class. The 
	 * values are returned after calculating the total weight of a box of tea bags.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double bagWeight, bagCount;
		
		System.out.println("enter tea bag weight (grams): ");
		bagWeight = input.nextDouble();
		
		System.out.println("enter tea bag count: ");
		bagCount = input.nextDouble();
		
		TeaBagBox teabag = new TeaBagBox(bagWeight, bagCount);
		
		System.out.printf("getBagWeight() reports: %.1f %n", teabag.getBagWeight());
		System.out.printf("getBagCount() reports: %.1f %n", teabag.getBagCount());
		System.out.printf("calculateTotalWeight() reports: %.4f %n", teabag.calculateTotalWeight());
		System.out.println("Program by Reshail Sohail");
		
		input.close();

	}

}
