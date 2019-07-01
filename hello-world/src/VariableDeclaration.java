/**
 * We declare a public class named VariableDeclaration.
 * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L1-L18
 */

public class VariableDeclaration {

    /**
     * The Java programming language is statically-typed,
     * which means that all variables must first be declared before they can be used.
     * In addition to the 8 primitive data types supported in Java (byte, short, int, long, float, double, boolean, and char)
     * the Java programming language also provides special support for character strings via the java.lang.String class.
     * A variable declared as type String with it's character string enclosed within double quotes will automatically
     * create a new String object.
     * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     * See https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * In our example, helloWorldString is initialized with the character string "Hello World" using the semantics of
     * an assignment to our declared variable.
     * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.3.2
     * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.26
     *
     * We declare a variable of the type String named helloWorldString with the private access modifier.
     * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L6-L9
     *
     * helloWorldString is a Class variable. Class variables or static fields are variables declared with the static modifier.
     * There is only one copy of a static field and it belongs to the class rather than an instance of that class (an object).
     * A variable that is not declared as static is created only when the class is instantiated as an object.
     * therefore in order to use helloWorldString as an argument to our main methods println method, it must be declared static.
     * See https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
     */

    private static String helloWorldString = "Hello World";


    /**
     * We declare our main class method.
     * See https://github.com/floatsoft/java-references/blob/bubble-sort/hello-world/src/HelloWorld.java#L20-L46
     */

    public static void main(String[] args) {

        /**
         * We pass helloWorldString as an argument to the println method to print "Hello World" to our terminal.
         * See https://github.com/floatsoft/java-references/blob/bubble-sort/hello-world/src/HelloWorld.java#L48-L62
         * See https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
         */
        System.out.println(helloWorldString);

    }
}

/**
 * The easiest way to run this code is by opening it in an IDE, such as IntelliJ
 * IDEA, and selecting run 'VariableDeclaration' from the interface.
 */
