1. A local variable is not initialized with a default value.
2. You must initialize FULLY (not in a conditional statement / switch statement / while loop if all conditions are not met) if you are using the variable in code.
3. If you never use the variable, no compiler error occurs.
4. Literals with decimal  default to double , not float.
5. Doubles and floats do not overflow, since they are approximated.
6. Local variable primitives are not initialized.
7. Class static and instance members are initialized.
8. null is not a valid value for a primitive data type.