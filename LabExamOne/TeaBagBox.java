
/*
 * Student Name: Reshail Sohail
 * Lab Professor: Wafa Hasanain
 * Due Date: October 13, 2022
 * Modified: Oct 13, 2022
 * Description: Lab Exam 1 
 */

 /*
  * This class is used to create Tea Bag objects and calculate the total weight  
  * of a box of teabags.
  */

public class TeaBagBox {

	private double bagWeight;
	private double bagCount;
	
	public TeaBagBox(double bagWeight, double bagCount) {
		this.bagWeight = bagWeight;
		this.bagCount = bagCount;
	}
	
	/*
	 * getter for bagWeight
	 */
	public double getBagWeight() {
		return bagWeight;
	}
	
	/*
	 * setter for BagWeight
	 */
	public void setBagWeight(double bagWeight) {
		this.bagWeight = bagWeight;
	}
	
	/*
	 * getter for bagCount
	 */
	public double getBagCount() {
		return bagCount;
	}
	
	/*
	 * setter for bagCount
	 */
	public void setBagCount(double bagCount) {
		this.bagCount = bagCount;
	}
	
	/*
	 * helper worker method to compute total weight of a box of tea bags
	 */
	public double calculateTotalWeight() {
		return bagWeight*bagCount;
	}
	
	

}