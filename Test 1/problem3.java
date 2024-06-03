// Write a program to rotate an array of integers in the left direction by 1 position

// Input Format

// 20, 30, 40

// Constraints

// No

// Output Format

// 30, 40, 20


// program:

import java.util.*;
public class problem3 {
    public static void main(String[] args) {
         // Input array
        int[] array = {20, 30, 40};
       
        // Rotating the array to the left by 1 position
        rotateLeftByOne(array);
        
         
        System.out.println(Arrays.toString(array).replaceAll("[\\[\\]]", ""));
        }
    
    public static void rotateLeftByOne(int[] array){
        if(array == null || array.length == 0 )
        {
            return;
        }
        int first = array[0];
        int i;
        for(i = 0; i<array.length - 1; i++){
            array[i] = array[i+1];
        }
        array[i] = first;
    }
}

    
// Explanation:

// Arrays.toString(array) converts the array into a string representation that includes square brackets [ ] around the elements. replaceAll("[\\[\\]]", "") removes these square brackets from the string.

// Here's how it works:

// "[\\[\\]]": This regular expression matches square brackets [ and ]. The backslashes (\) are used to escape the square brackets because they have special meaning in regular expressions.
// replaceAll("[\\[\\]]", ""): This method call replaces all occurrences of [ and ] in the string representation of the array with an empty string, effectively removing them.
// So, if array contains elements {30, 40, 20}, Arrays.toString(array) would return "[30, 40, 20]", and replaceAll("[\\[\\]]", "") would remove the square brackets, resulting in "30, 40, 20".