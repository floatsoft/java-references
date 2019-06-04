/**
 * Classes function like blueprints used to construct objects. A class
 * declaration may include class modifiers.
 * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.1.1
 * 
 * Public, protected, and private are access modifiers, public may be used on
 * top level classes as illustrated in the code below, protected and private
 * pertain only to member classes.
 * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-6.html#jls-6.6
 * 
 * A class declared as public may be accessed by any code.
 * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-6.html#jls-6.6.1
 * 
 * In our example, we could also use the default access level by not including
 * any access modifier.
 */

public class HelloWorld {

    /**
     * A method declares executable code.
     * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.4
     * 
     * A method that is declared static is called a class method.
     * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.4.3.2
     * The below code illustrates a class method declaration.
     * 
     * The keyword void indicates that the method does not return a value.
     * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.4.5
     * 
     * Following the void keyword is the method name, in this case our method is
     * named main. The main method is special, and serves as the entry point for
     * your application, it will subsequently invoke all the other methods required
     * by your program.
     * See https://docs.oracle.com/javase/tutorial/getStarted/application/index.html#MAIN
     * 
     * A list of zero or more comma-separated parameter specifiers, known as the
     * formal parameters, follow the method name. Each parameter specifier consists
     * of a type (i.e String[]) and an identifier (i.e args).
     * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.4.1
     * 
     * The method name and argument types make up the method signature.
     * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.4.2
     */

    public static void main(String[] args) {

        /**
         * The System class contains, among other class fields and methods, the standard
         * output stream field, out.
         * See https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
         * 
         * The class field, out, exposes the println methods.
         * See https://docs.oracle.com/javase/7/docs/api/java/lang/System.html#out
         * 
         * The println(String x) method prints the String argument passed to it, in this
         * case "Hello World", and then terminates the line by writing the line
         * separator string.
         * See https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html#println(java.lang.String)
         */

        System.out.println("Hello World");

    }
}

/**
 * The easiest way to run this code is by opening it in an IDE, such as IntelliJ
 * IDEA, and selecting run 'HelloWorld' from the interface.
 */