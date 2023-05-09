/**
 * The Cone class represents a cone object, which has a radius and height, and can calculate its volume.
 */
public class Cone {
    
    double radius; // the radius of the cone
    double height; // the height of the cone
    
    /**
     * Gets the radius of the cone.
     * @return The radius of the cone.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Sets the radius of the cone.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Gets the height of the cone.
     * @return The height of the cone.
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Sets the height of the cone.
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Calculates the volume of the cone using its radius and height.
     * @return The volume of the cone.
     */
    public double calculateVolume() {
        return (Math.PI*Math.pow(radius,2)*height)/3;
    }

}
