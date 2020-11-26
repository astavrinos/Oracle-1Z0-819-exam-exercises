/*
The learn programming academy java se 11 developer 1z0-819 OCP course - Part 1
Section 2: import statements
 */

package a.c;

import java.lang.*; // this is redundant but ok, always included

import a.c.ImportTests; // this is redundant but ok, code will compile

import a.b.PackageTests; // this includes classes defined in a but not a.b

public class ImportTests {

    public static void main(String[] args) {
        System.out.println("Import Tests");
        PackageTests.main(args);
    }

}
