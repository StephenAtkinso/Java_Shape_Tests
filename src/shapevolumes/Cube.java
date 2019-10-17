package shapevolumes;

public class Cube {

    private double sideLength;
    private double volume;
    private double volRoundedDouble;
    private String volRounded;

    //Due to method repetition all three shape objects should inherit from one parent shape class
    //Constructor for the cube object where the volume calc method is called and the value is rounded
    public Cube(double sideLength){
        this.sideLength = sideLength;
        volume = calculateCubeVolume(sideLength);
        volRounded = String.format("%.2f", volume);
        volRoundedDouble = Double.parseDouble(volRounded);
    }

    //Method to calculate the cube volume
    private double calculateCubeVolume(double cubeSideLength){
        double cubeVol = Math.pow(cubeSideLength, 3);
        return cubeVol;
    }

    //Getters for the rounded volume value and the side length of the cube
    public double getVolRoundedDouble(){
        return volRoundedDouble;
    }

    public double getSideLength(){
        return sideLength;
    }

}
