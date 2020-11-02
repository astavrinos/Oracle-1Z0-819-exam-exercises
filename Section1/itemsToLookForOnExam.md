1. Multiple package statements
2. A package statement that is not the first line of code
3. Import statement not in the correct order, must be after a package statement if one exist and before any other code.
4. Import static statement used in place of an import statement.
5. Import statement using a higher level package with a wild card <b>- *</b>, a wild card does not include classes in other packages. Example. import <b>a.*</b> does not also mean import <b>a.b.*</b> for example.
6. A misplaced wildcard, for example the <b>*</b> at the end of a class name or a partial class name.