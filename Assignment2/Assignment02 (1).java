//ToDo: Supervisor wants programmer comments (use /* */ comment)

//ToDo: Supervisor wants programmer comments (use /* */ comment)

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		CircularSawBlade blade = new CircularSawBlade();
		
		Scanner input = new Scanner(System.in);
		double diameter;
		double kerf;
		int bladeCount=0;
		String doYouWantToContinue = "yes";
		
		while(doYouWantToContinue.toLowerCase().equalsIgnoreCase("yes")) {
	
		System.out.println("Enter measured diameter: ");
		diameter = input.nextDouble();
		blade.setDiameter(diameter);
		
		System.out.println("Enter measured kerf: ");
		kerf = input.nextDouble();
		blade.setKerf(kerf);


		CircularSawBlade sawblade = new CircularSawBlade(diameter, kerf);
		System.out.printf("%s", blade.toString());
		boolean verifyDiameter = CircularSawBladeVerifier.isDiameterInTolerance(blade);
		if(verifyDiameter == true) 
		{
			System.out.println("Diameter is within tolerance."); }
		
		else {System.out.println("Diameter is out of tolerance.");
			int diameterCount = 0;
			diameterCount++;
			System.out.println("Diameter(s) out of tolerance: " + diameterCount);
		}
		boolean verifyKerf = CircularSawBladeVerifier.isKerfInTolerance(blade);
		if(verifyKerf == true) 
		{
			System.out.println("Kerf is within tolerance."); }
		
		else {System.out.println("Kerf is out of tolerance.");
			int kerfCount = 0;
			kerfCount++;
			System.out.println("Kerf(s) out of tolerance: " + kerfCount);
		}
		bladeCount++;
	
		System.out.println("Blades entered: " + bladeCount);
		
		System.out.println("Name: Reshail Sohail ");
		
		System.out.println("Continue (yes/no)? ");
		doYouWantToContinue=input.next();
		}
	}
	}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */