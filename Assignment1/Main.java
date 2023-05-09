/**
 * This is the main method that prompts the user to enter the height and radius of a cone, and calculates its volume.
 */
public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    double userInput1; // stores the user's input for the height of the cone
    double userInput2; // stores the user's input for the radius of the cone
    double volume; // stores the calculated volume of the cone
    Cone cone = new Cone(); // creates a new instance of the Cone class
    
    System.out.print("Please enter the height of the cone: ");
    userInput1 = keyboard.nextDouble(); // get the user's input for the height of the cone
    keyboard.nextLine(); // consume the newline character left over from the previous call to nextDouble()
    cone.setHeight(userInput1); // set the height of the cone in the Cone instance
    
    System.out.print("Please enter the radius of the cone: ");
    userInput2 = keyboard.nextDouble(); // get the user's input for the radius of the cone
    keyboard.nextLine(); // consume the newline character left over from the previous call to nextDouble()
    cone.setRadius(userInput2); // set the radius of the cone in the Cone instance
    
    volume = cone.calculateVolume(); // calculate the volume of the cone using the Cone instance
    System.out.println("The volume of the cone is: " + volume); // display the calculated volume of the cone
    System.out.println("Program by Reshail Sohail"); // display the name of the program's author
}
