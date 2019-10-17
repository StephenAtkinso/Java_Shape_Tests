package shapevolumes;

public class Sphere {

    private double radius;
    private double volume;
    private double volRoundedDouble;
    private String volRounded;

    //Due to method repetition all three shape objects should inherit from one parent shape class
    //Sphere constructor where volume calc method is called, value is then rounded
    public Sphere(double radius){
        this.radius = radius;
        volume = calculateSphereVol(radius);
        volRounded = String.format("%.2f", volume);
        volRoundedDouble = Double.parseDouble(volRounded);
    }

    //Method to calculate the volume of the sphere
    private double calculateSphereVol(double sphereRadius){
        double calculatedSphereVol = (1.3333333333 * Math.PI * Math.pow(sphereRadius, 3));
        return calculatedSphereVol;
    }

    //Getters for the rounded volume value and the radius of the sphere
    public double getVolRoundedDouble(){
        return volRoundedDouble;
    }

    public double getRadius(){
        return radius;
    }

}
