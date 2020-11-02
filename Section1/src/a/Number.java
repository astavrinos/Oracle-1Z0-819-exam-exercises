/*
The learn programming academy java se 11 developer 1z0-819 OCP course - Part 1
Section 2: packages and import statements
 */

package a;

// it is ok to create a class that is defined in java.lang
class Number {

    Number number;
    java.lang.Number numberj;

    Number(java.lang.Number number) {
        this.numberj = number;
        System.out.println("Constructor for java.lang.number");
    }

    Number(Number number) {
        this.number = number;
        System.out.println("Constructor for a.Number");
    }

    public static void main(String[] args) {
        Number n = new Number(10);
        Number n2 = new Number(n);
    }

}
