//ToDo: Supervisor wants programmer comments (use /* */ comment)

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class CircularSawBladeVerifier {
	public static final double EPSILON=0.015625;
	// ToDo: Create a public static final EPSILON with value 0.015625
	//       i.e. one-64th of an inch 1/64
	
	/*
	 * This is a utility class with only static members, prevent
	 * Instantiation.
	 */
	private CircularSawBladeVerifier() {}
	
	//ToDo: Supervisor wants programmer comments (use /* */ comment)
	public static boolean isDiameterInTolerance(CircularSawBlade blade) {
		double difference;
		difference = Math.abs(CircularSawBlade.EXPECTED_DIAMETER-blade.getDiameter());
				if (difference<=EPSILON) {
			return true;
				}
			else {
			return false;
			} 
	}
		public static boolean isKerfInTolerance(CircularSawBlade blade) {
			double differencetwo;
			differencetwo = Math.abs(CircularSawBlade.EXPECTED_KERF-blade.getKerf());
					if (differencetwo<=EPSILON) {
				return true;
					}
				else {
				return false;
				} 
	}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */
