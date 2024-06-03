// Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.

// Input Format

// 50, -20, 0, 30, 40, 60, 10

// Constraints

// No

// Output Format:

// false

// program:

import java.io.*;
import java.util.*;

public class problem1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int arr[]= {50, -20, 0, 30, 40,60, 10};
        if(arr.length>=2)
        {
            boolean result = (arr[0]== (arr.length-1));
            System.out.println(result);
        }
        else{
            System.out.println("Array length must be greater than or equal to 2");
        }
    }
}

// Explanation:

// The program initializes an array of integers: {50, -20, 0, 30, 40, 60, 10}.
// Equality Test Method:

// isFirstLastElementEqual(int[] array): This method tests if the first and last elements of the given array are equal.
// If the array is null or its length is less than 2, it returns false.
// Otherwise, it compares the first element (array[0]) with the last element (array[array.length - 1]). If they are equal, it returns true; otherwise, it returns false.
// Output:

// The result of the equality test is printed, which in this case would be false.