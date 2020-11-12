<ol>
<li>A local variable is not initialized with a default value.</li>
<li> You must initialize FULLY (not in a conditional statement / switch statement / while loop if all conditions are not met) if you are using the variable in code.</li>
<li> If you never use the variable, no compiler error occurs.</li>
<li> Literals with decimal  default to double , not float.</li>
<li> Doubles and floats do not overflow, since they are approximated.</li>
<li> Local variable primitives are not initialized.</li>
<li> Class static and instance members are initialized.</li>
<li> null is not a valid value for a primitive data type.</li>
<li> var is NOT to be confused with variable type.</li>
<li> Just because you define a local variable with the var designation, it does not mean it is a variable type.</li>
<li> The type is inferred by it's initialization, and cannot be changed.</li>
<li> All the narrowing, widening rules for the inferred type apply.</li>
<li> You cannot use local variable type inference (var) for:
    <ul>
        <li>Class or Instance variables</li>
        <li>Method return types.</li>
        <li>Method parameters.</li>
        <li>Constructor parameters.</li>
    </ul>
</li>
<li> You can use Local Variable Type Inference (var) for:
    <ul>
        <li>Local variables in methods & code blocks.</li>
        <li>Loop variables.</li>
    </ul>
</li>
<li> Literal strings have their own special area of the heap memory called the String Pool.</li>
<li> Any assignment of a literal will refer to the same String in this pool.</li>
<li> You can force a string to be added to the pool by calling the intern() method on the String object.</li>
<li> Strings are immutable, any methods that seem to operate on a String are actually creating new String, and these new String need to be assigned to the same variable (self assignment) or assigned to a new variable which represents a reference to the new String.</li>
<li> Strings are immutable, any method you use that returns a value needs to be assigned to a different String reference or back to the current one. stringBuilders ARE mutable.</li>
<li> String constructors and valueOf methods use a start offset (inclusive) and an end offset (exclusive).</li>
<li> Methods that use regular expressions are:
    <ul>
        <li>matches() (must match an entire String)</li>
        <li>split()</li>
        <li>replaceAll and replaceFirst.</li>
    </ul>
</li>
</ol>