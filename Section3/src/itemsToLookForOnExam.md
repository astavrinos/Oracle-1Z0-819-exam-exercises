1. A local variable is not initialized with a default value.
2. You must initialize FULLY (not in a conditional statement / switch statement / while loop if all conditions are not met) if you are using the variable in code.
3. If you never use the variable, no compiler error occurs.
4. Literals with decimal  default to double , not float.
5. Doubles and floats do not overflow, since they are approximated.
6. Local variable primitives are not initialized.
7. Class static and instance members are initialized.
8. null is not a valid value for a primitive data type.
9. var is NOT to be confused with variable type
10. Just because you define a local variable with the var designation, it does not mean it is a variable type.
11. The type is inferred by it's initialization, and cannot be changed
12. All the narrowing, widening rules for the inferred type apply.
13. You cannot use local variable type inference (var) for:
    a. Class or Instance variables
    b. Method return types.
    c. Method parameters.
    d. Constructor parameters.
14. You can use Local Variable Type Inference (var) for:
    a. Local variables in methods & code blocks.
    b. Loop variables.
15. Literal Strings have their own special area of the heap memory called the String Pool.
16. Any assignment of a literal will refer to the same String in this pool.
17. You can force a string to be added to the pool by calling the intern() method on the String object
18.Strings are immutable, any methods that seem to operate on a String are actually creating new String, and these new String need to be assigned to the same variable (self assignment) or assigned to a new variable which represents a reference to the new String.
