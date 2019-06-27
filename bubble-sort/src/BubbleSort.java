/**
 * This is an implementation of the bubble sort algorithm written in Java.
 * See https://en.wikipedia.org/wiki/Bubble_sort#Implementation
 */

/**
 * The Arrays class imported from java.util.Arrays contains various methods for manipulating arrays.
 * See https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
 */
import java.util.Arrays;

/**
 * We declare a public class named BubbleSort.
 * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L1-L18
 */
public class BubbleSort {

    /**
     * We declare a static field named unsortedNumbersList with the private access modifier.
     * See https://github.com/floatsoft/java-references/blob/hello-world/hello-world/src/VariableDeclaration.java#L8-L33
     * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L6-L9
     *
     * unsortedNumbersList is declared with the type int[], meaning that it is an array containing values of the
     * primitive type int.
     * The [] may appear as part of the type at the beginning of the declaration, or as part of the declarator
     * for a particular variable, or both.
     * See https://github.com/floatsoft/java-references/blob/hello-world/hello-world/src/VariableDeclaration.java#L11
     * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html#jls-10.2
     *
     * unsortedNumbersList is initialized with the following array: {8, 5, 6, 9, 3, 1, 4, 2, 7, 10}
     * Java supports the C-style curly braces {} construct for creating an array and initializing its elements when it
     * is declare. An array object of the proper type and length is implicitly created, and the values of the
     * comma-separated list of expressions are assigned to its elements.
     * See https://github.com/floatsoft/java-references/blob/hello-world/hello-world/src/VariableDeclaration.java#L18-L21
     * See https://www.oreilly.com/library/view/learning-java-4th/9781449372477/ch04s07.html#learnjava3-CHP-4-SECT-7.2
     *
     * unsortedNumbersList is a one-dimensional array.
     * See https://en.wikipedia.org/wiki/Array_data_structure#One-dimensional_arrays
     */
    private static int[] unsortedNumbersList = {8, 5, 6, 9, 3, 1, 4, 2, 7, 10};

    /**
     * We declare a private static method named bubbleSort.
     * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L20-L46
     * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L6-L9
     *
     * bubbleSort returns a value of type int[], meaning that it returns an array containing values of the
     * primitive type int.
     * See https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html
     * See https://github.com/floatsoft/java-references/blob/bubble-sort/bubble-sort/src/BubbleSort.java#L23-L28
     *
     * the bubbleSort method takes a single formal parameters; arr. the arr parameter specifier contains the type int[],
     * therefore arr must be an array of integers. In our example arr will receive unsortedNumbersList as it's argument.
     * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L37-L40
     */
    public static int[] bubbleSort(int[] arr) {

        /**
         * We declare a Boolean named swapped, we do not initiate it with a value as the next lines will make our
         * initialization redundant. However, primitives and objects in Java have specific default values, for
         * instance the default value of our boolean will be false.
         * byte, short, int, long, float, double, char, boolean, and String (or any object) have the default default
         * values of 0, 0, 0, oL, 0.0f, 0.0d, "\u0000", false, and null respectively.
         * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
         */
        Boolean swapped;

        /**
         * The do...while statement creates a loop that executes it's block until the
         * test condition evaluates to false. The while statement evaluates it's expression, 
         * which must return a boolean value.
         * Unlike the while loop, the do...while loop will always execute at least once.
         * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
         */
        do {
            swapped = false;

            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println("before: " + Arrays.toString(arr));

                if (arr[i] > arr[i + 1]) {
                    var tmp = arr[i];

                    arr[i] = arr[i + 1];

                    arr[i + 1] = tmp;

                    swapped = true;

                    System.out.println("after: " + Arrays.toString(arr));
                }
            }
        } while (swapped);

        System.out.println("final: " + Arrays.toString(arr));

        return arr;

    }

    public static void main(String[] args) {

        bubbleSort(unsortedNumbersList);

    }


}

/**
 * The easiest way to run this code is by opening it in an IDE, such as IntelliJ
 * IDEA, and selecting run 'HelloWorld' from the interface.
 */
