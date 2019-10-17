package shapevolumes;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {

    @Test
    public void testAssertions(){

        //Values to be tested against
        double sphereTest1 = 4.19;
        double sphereTest2 = 523.6;
        double cubeTest1 = 1;
        double cubeTest2 = 125;
        double tetTest1 = 0.12;
        double tetTest2 = 14.73;

        //Shape objects created with the specified parameters to test against the above values
        Sphere testSphere1 = new Sphere(1);
        Sphere testSphere2 = new Sphere(5);
        Cube testCube1 = new Cube(1);
        Cube testCube2 = new Cube(5);
        RegTetrahedron testTet1 = new RegTetrahedron(1);
        RegTetrahedron testTet2 = new RegTetrahedron(5);

        //Testing the sphere volume calculations
        assertEquals(sphereTest1, testSphere1.getVolRoundedDouble(), 0.00);
        assertEquals(sphereTest2, testSphere2.getVolRoundedDouble(), 0.00);

        //Testing the cube volume calculations
        assertEquals(cubeTest1, testCube1.getVolRoundedDouble(), 0.00);
        assertEquals(cubeTest2, testCube2.getVolRoundedDouble(), 0.00);

        //Testing the tetrahedron volume calculations
        assertEquals(tetTest1, testTet1.getVolRoundedDouble(), 0.00);
        assertEquals(tetTest2, testTet2.getVolRoundedDouble(), 0.00);

    }


}
