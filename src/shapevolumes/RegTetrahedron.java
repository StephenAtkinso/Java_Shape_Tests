package shapevolumes;

public class RegTetrahedron {

    private double sideLength;
    private double volume;
    private double volRoundedDouble;
    private String volRounded;

    //Due to method repetition all three shape objects should inherit from one parent shape class
    //Constructor for the tetrahedron shape where the volume calc method is called and the value is rounded
    public RegTetrahedron(double sideLength){
        this.sideLength = sideLength;
        volume = calculateVolume(sideLength);
        volRounded = String.format("%.2f", volume);
        volRoundedDouble = Double.parseDouble(volRounded);
    }

    //Method for calculating the volume of the tetrahedron
    private double calculateVolume(double sideLength){
        double regTetVolume = (0.0833333333 * Math.sqrt(2) * Math.pow(sideLength, 3));
        return regTetVolume;
    }

    //Getters for the rounded volume value and the side length of the tetrahedron
    public double getVolRoundedDouble(){
        return volRoundedDouble;
    }

    public double getSideLength(){
        return sideLength;
    }

}
