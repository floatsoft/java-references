/**
 * This is an implementation of the bubble sort algorithm written in Java.
 * See https://en.wikipedia.org/wiki/Bubble_sort#Implementation
 */

/**
 * The Arrays class imported from java.util.Arrays contains various methods for manipulating arrays.
 * See https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
 */
import java.util.Arrays;

public class BubbleSort {

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

