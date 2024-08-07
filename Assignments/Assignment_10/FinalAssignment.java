import java.util.Arrays; // for toString() only

public class FinalAssignment {

    /**
     * Takes two sorted arrays and merged them into a sorted array. The method takes
     * advantage of the fact that the input arrays are already sorted. It traverses
     * them from front to end, ie, from smallest to larger elements. At any given
     * time, the method looks at the smallest elements at both arrays, finds the
     * smaller, places it in the marged array and moves to the next smallest element
     * in the array just used.
     * 
     * @param left  one of the two arrays to merge
     * @param right the other of the two arrays to merge
     * @return merged array with its elements also sorted.
     */
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0; // index for array left
        int j = 0; // index for array right
        int k = 0; // index for array merged
        /*
         * Work through both arrays, from beginning to end, comparing the current
         * element from arrays left and right. Place the smallest of the two in array
         * merged, and advance the index of the array that was just used.
         */
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            // Advance the index for array merged
            k++;
        }
        /*
         * In some cases, we may run out of elements to consider in either input arrays;
         * i.e., either the i < left.length or the j < right.length condition will fail.
         * If so, we do not really know which index ended first, i or j? Therefore, we
         * try two more loops, one for each of the input arrays. At most, only one of
         * the two loops below will execute. And it will copy the remaining elements of
         * the corresponding array into the merged array.
         */
        while (i < left.length) {
            merged[k++] = left[i++]; // ++ in same line for brevity
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }
        // Done
        return merged;
    } // method merge

    /**
     * Reverses a string
     * 
     * @param string String to reverse
     * @return reversed string or null if string is null.
     */
    public static String reverse(String string) {
        String reversed = null;
        if (string != null) {
            reversed = "";
            for (int i = 0; i < string.length(); i++) {
                reversed = string.charAt(i) + reversed;
            }
        }
        return reversed;
    } // method reverse

    /**
     * A simple sorting method -- technically, this is the Selection Sort process.
     * 
     * It starts at the beginning of the array and searchs the entire unsorted
     * section of the array to find the smallest element. Then it swaps this
     * smallest element with the first element of the unsorted section. After than
     * it moves the boundary of the sorted section one element forward, and repeat
     * the process for the remaining unsorted section. The process continues until
     * the entire array is sorted. This is a simple but inefficient way to sort.
     * 
     * @param array to sort
     * @return the sorted array
     */
    public static int[] simpleSort(int[] array) {
        /*
         * The outer loop determines the left boundary of the unsorted portion of the
         * array. We start with the entire array being unsorted, and progressively move
         * the boundary all the way to the end of array.
         */
        for (int i = 0; i < array.length; i++) {
            /*
             * Set up to find the position, in the unsorted portion of the array. Assume
             * that the first element of the unsorted portion is the smallest one, then see
             * if there is a smaller one in the unsorted portion and update accordingly.
             */
            int indexOfSmallest = i;
            int smallest = array[indexOfSmallest];
            /*
             * Scan the unsorted portion to see if there is a value smaller than the assumed
             * smallest. Record its position, because we need it to perform a swap later.
             */
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < smallest) {
                    indexOfSmallest = j;
                    smallest = array[indexOfSmallest];
                }
                /*
                 * Swap the first element of the unsorted section with the smallest element in
                 * the section.
                 */
                int temp = array[indexOfSmallest];
                array[indexOfSmallest] = array[i];
                array[i] = temp;
            }
        }
        return array;
    } // method simpleSort

    /** Driver code for testing */
    public static void main(String[] args) {
        int[] testL = { 1, 3, 5, 7 };
        int[] testR = { 2, 4, 6, 8 };
        int[] merged = merge(testL, testR);
        System.out.printf("\nMerged arrays %s and %s into %s\n",
                Arrays.toString(testL),
                Arrays.toString(testR),
                Arrays.toString(merged));
        String test = "Hello";
        System.out.println(reverse(test));
        int[] unsorted = { 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.printf("Sorting %s into ",
                Arrays.toString(unsorted));
        int[] sorted = simpleSort(unsorted);
        System.out.printf("%s\n",
                Arrays.toString(sorted));
    } // main
}
