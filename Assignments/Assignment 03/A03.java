public class A03 {
    public static void main(String[] args) {
        // Daily temperatures for June
        int[] june = {
            72, 74, 68, 70, 75, 77, 80, 79, 65, 68,
            72, 74, 76, 78, 70, 72, 75, 77, 74, 76,
            73, 75, 72, 74, 78, 80, 75, 77, 72, 70
        };
        // Daily temperatures for July
        int[] july = {
            84, 86, 88, 85, 82, 84, 87, 89, 90, 85,
            86, 88, 84, 82, 85, 87, 89, 90, 85, 84,
            86, 87, 88, 90, 85, 84, 86, 88, 85, 87,
            85
        };              

        // Test countOf
        System.out.println(countOf(78, june)); // expect 2
        System.out.println(countOf(-78, june)); // expect 0

        // Test find max/min
        System.out.println(findMax(july)); // expect 90
        System.out.println(findMin(july)); // expect 82

        // Test isPresent
        System.out.println(isPresent(20, july)); // expect false
        System.out.println(isPresent(90, july)); // expect true
    } // method main

    /**
     * Counts how many times a specified value appears in a given array.
     * 
     * @param array int[] with values, to scan for a specific value
     * @param target int value to count its occurences.
     * @return the number of times the specific value appears in the array.
     */
    public static int countOf(int[] array, int target) {
        int count = 0;
        for(int value : array) {
            if (value = targer) {
                count++;
            }
        }
        
        return count;
    } // method countOf

    /**
     * Returns the max value in an array
     * @param array int[] array to scan
     * @return the maximum value in the array
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int x = 0; x < array.length; x++) {
            if (array[x] > max) { 
                max = array[x];
            }
        }
        
        return max;
    } // method findMax

    /**
     * Returns the min value in an array
     * @param array int[] array to scan
     * @return the minimum value in the array
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    } // method findMin

    /**
     * Determines if a specified value exists in a give array
     * @param target int value to search for
     * @param array int[] array to search through
     * @return true if target value is found in array, false otherwise
     */
    public static boolean isPresent(int target, int[] array) {
        boolean found = false;
        for (int b : array) {
            if (array[b] == target) {
                found = true;
                break; 
        }
        }
        
        return found;
    } // method contains

    /**
     * Determines if two arrays have at least one common value.
     * 
     * @param first int[] the first of the two arrays to consider
     * @param second int[] the second of the two arrays to consider
     * @return true if there is a common value in the two arrays; false otherwise
     */
    public static boolean intersect(int[] array1, int[] array2) {
        boolean intersection = false;
        return intersection;
    } // method intersects
}
