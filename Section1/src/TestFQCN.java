/*
The learn programming academy java se 11 developer 1z0-819 OCP course - Part 1
Section 2: Testing imports
 */

public class TestFQCN {

    public static void main(String[] args) {
        // String class in the java.lang package, simple class name ok
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        // Any class in any other packages must be qualified or imported
        garden.vegetable.VineVegetable.main(args);
    }

}
