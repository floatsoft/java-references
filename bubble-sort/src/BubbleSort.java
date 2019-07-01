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
         * We declare a boolean named swapped, we do not initiate it with a value as the next lines will make our
         * initialization redundant. However, primitives and objects in Java have specific default values, for
         * instance the default value of our boolean will be false.
         * byte, short, int, long, float, double, char, boolean, and String (or any object) have the default default
         * values of 0, 0, 0, oL, 0.0f, 0.0d, "\u0000", false, and null respectively.
         * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
         */
        boolean swapped;

        /**
         * The do...while statement creates a loop that executes it's block until the
         * test condition evaluates to false. The while statement evaluates it's expression,
         * which must return a boolean value.
         * Unlike the while loop, the do...while loop will always execute at least once.
         * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
         *
         * A block is a group of zero or more statements between balanced braces and can be used anywhere a single
         * statement is allowed.
         * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
         */
        do {
            /**
             * We assign our boolean variable named swapped to false, one of the data types only two possible values,
             * the other value being true.
             * See https://github.com/floatsoft/java-references/blob/bubble-sort/bubble-sort/src/BubbleSort.java#L42-L56
             * Anticipating that the loop must run more than once, we use the below line to ensure that it will
             * eventually end.
             */
            swapped = false;

            /**
             * The for statement creates a loop that consists of three optional expressions; the initialization,
             * termination, and increment expressions.
             * Following the expressions is the block to be executed.
             * See https://github.com/floatsoft/java-references/blob/bubble-sort/bubble-sort/src/BubbleSort.java#L75-L77
             * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
             *
             * We initialize our for loop by declaring an int named i assigned the integer value 0.
             * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
             * This serves as our initialization expression, in this case used to initialize a counter.
             *
             * The condition of our for loop must be met before each loop iteration.
             * In this case i must be less than the length of arr - 1.
             * See https://www.geeksforgeeks.org/length-vs-length-java/
             * If the expression evaluates to false, execution skips to the first expression following the block.
             *
             * For our final-expression we increment our int i by 1 using the ++ unary operator.
             * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
             * This occurs before the next evaluation of condition.
             *
             * Following our expressions is our block, this block contains our main sorting logic.
             * See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/block
             */
            for (int i = 0; i < arr.length - 1; i++) {
                /**
                 * We print our array using the println method just before entering the adjacent pair comparison and
                 * subsequent sorting logic of our bubbleSort method.
                 * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L48-L62
                 * See https://en.wikipedia.org/wiki/Bubble_sort#Step-by-step_example
                 *
                 * One of the methods contained in our Array class is the toString method which Returns a string
                 * representation of the contents of the specified array.
                 * See https://github.com/floatsoft/java-references/blob/bubble-sort/bubble-sort/src/BubbleSort.java#L6-L10
                 * See https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#toString(int[])
                 *
                 * By default in Java an array is printed as the arrays class name followed by its hash value.
                 * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html#jls-10.8
                 *
                 * We use the toString method here so that we can print a readable representation of our array.
                 */
                System.out.println("before: " + Arrays.toString(arr));

                /**
                 * An if-then statement executes it's block only if a specified condition evaluates to true.
                 * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
                 *
                 * Our if condition is described just before our block.
                 * Our condition dictates that arr[i] must be greater than arr[i + 1] using the greater than operator.
                 * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
                 *
                 * As a reminder, arr represents the single argument being passed to our bubbleSort function,
                 * unsortedNumbersList, and arr must be an Array.
                 * See https://github.com/floatsoft/java-references/blob/bubble-sort/bubble-sort/src/BubbleSort.java#L18-L40
                 *
                 * We can select elements from our array by referencing there index enclosed by [ and ], i.e: arr[i].
                 * See https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html#jls-10.4
                 * Here we use our variable i and the sum of i + 1 as our indexes.
                 */
                if (arr[i] > arr[i + 1]) {
                    var tmp = arr[i];

                    arr[i] = arr[i + 1];

                    arr[i + 1] = tmp;

                    swapped = true;

                    /**
                     * We print our array again using the println method just after the swap takes place.
                     * See https://en.wikipedia.org/wiki/Bubble_sort#Step-by-step_example
                     */
                    System.out.println("after: " + Arrays.toString(arr));
                }
            }
        } while (swapped);

        /**
         * We print our array once more using the println method; unsortedNumbersList is now sorted in ascending order.
         * See https://en.wikipedia.org/wiki/Bubble_sort#Step-by-step_example
         */
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
