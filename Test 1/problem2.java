// problem2:

// Write a program to multiply the corresponding elements of two integer arrays.

// Input Format

// 1, 3, -5, 4

// 1, 4, -5, -2

// Constraints

// #include <cstdio>
// #include <cstdlib>
// #include <cstring>
// #include <algorithm>
// #include <iostream>

// int p;
// int main() {
//     ge();
//     vector<int> v;
//     return 0;
// }
// Output Format

// 1 12 25 -8

// Program:

import java.io.*;
import java.util.*;

public class problem2 {

    public static void main(String[] args) {
        int[] arr1 = {1,3,-5,4};
        int[] arr2 = {1,4, -5,-2};
        
        if(arr1.length != arr2.length)
        {
            System.out.println("Array must have same length");
            return;
        }
        
        int[] result = new int[arr1.length];
        for(int i=0; i<result.length; i++)
        {
            result[i] = arr1[i]*arr2[i];
        }
        
        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]);
            if(i<result.length - 1)
            {
                System.out.print(" ");
            }
        }

    }
}


