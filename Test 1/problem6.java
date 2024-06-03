// problem6:
// Write a program to separate 0s and 1s in an array of 0s and 1s into left and right sides.

// Input Format

// First line contain size of array second line contain all the input array elements containing mix of 0 and 1

// Constraints

// No

// Output Format

// Print all the array element where 0s will be left and 1s will be right

// program:

import java.io.*;
import java.util.*;

public class problem6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] array = new int[size];
        
        for (int i=0 ; i< size ; i++){
            array[i] = sc.nextInt();
        }
        
        int left =0;
        int right = size -1;
        while(left<right){
            while(array[left] == 0){
                left++;
            }
            while(array[right] == 1){
                right--;
            }
            if(left<right){
                array[left]=0;
                left++;
                array[right]=1;
                right--;
            }
        }
        
        for(int i=0; i < size; i++){
            System.out.print(array[i]+" ");
        }   
    }
}