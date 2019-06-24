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
     * The Java programming language is statically-typed,
     * which means that all variables must first be declared before they can be used.
     * See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     *
     * We declare a variable (or field) of the type int[] named unsortedNumbersList.
     * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L1-L18
     *
     * We declare unsortedNumbersList with the private access modifier.
     * See https://github.com/floatsoft/java-references/blob/master/hello-world/src/HelloWorld.java#L6-L9
     *
     * Class variables or static fields are variables declared with the static modifier.
     * There is only one copy of a static field and it belongs to the class rather than an instance of that class (an object).
     * A variable that is not declared as static is created only when the class is instantiated as an object.
     * therefore in order to use unsortedNumbersList as a variable in our main method, it must be declared static.
     * See https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
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

