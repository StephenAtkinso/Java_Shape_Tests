package shapevolumes;

public class ShapeVolumes {

    public static void main(String[] args){

        //Creating one of each shape with a particular value and printing some information about them
        Sphere sph1 = new Sphere(5);
        Cube cu1 = new Cube(5);
        RegTetrahedron rtet1 = new RegTetrahedron(1);

        System.out.println("The volume of the sphere with the radius of: " + sph1.getRadius() + " is\n"
                + sph1.getVolRoundedDouble() + " cubic units.");

        System.out.println("The volume of the cube with the side length of: " + cu1.getSideLength() + " is\n"
                + cu1.getVolRoundedDouble() + " cubic units.");

        System.out.println("The volume of the regular tetrahedron with the side length of: " + rtet1.getSideLength()
                + " is\n" + rtet1.getVolRoundedDouble() + " cubic units.");
    }

}
