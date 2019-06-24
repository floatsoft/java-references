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
     * We declare a static variable named unsortedNumbersList, with the private access modifier.
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

    public static int[] bubbleSort(int[] arr) {

        Boolean swapped;

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

