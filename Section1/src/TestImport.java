/*
The learn programming academy java se 11 developer 1z0-819 OCP course - Part 1
Section 2: Testing imports
 */

// A single-type-import declaration
import garden.vegetable.*;
import nursery.vegetable.*;

public class TestImport {

    public static void main(String[] args) {

        // String class in the java.lang package, simple class name ok
        // no import statement required
        String s = "We are testing import statements";
        System.out.println(s);

        // We use simple name because we specified location in the import
        // statement
        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args);
    }

}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}