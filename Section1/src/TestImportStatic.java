/*
The learn programming academy java se 11 developer 1z0-819 OCP course - Part 1
Section 2: Testing Import static statements
 */

// a single-static-import declaration for static variable
import static java.lang.Math.PI;

// a single-static-import declaration for static method
import static java.lang.Math.sqrt;

// a static-import on demand declaration for static variable
//import static java.lang.Math.*;

public class TestImportStatic {

    public static void main(String[] args) {
        int radius = 2;

        //We can use a static class variable on the ath class to get the value of PI
        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        // we can use a static class method on the math class to get the square root of a number
        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }

}
