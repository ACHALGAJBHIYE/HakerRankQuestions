// problem5:

// Write a program to remove a specific element from an array.

// Input Format

// First line contain size of array Second line contain all the input array elements third line contain element to be remove

// Constraints

// No

// Output Format

// print array element by removing input element

// program:

import java.io.*;
import java.util.*;

public class problem5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        
        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }
        
        int remove = sc.nextInt();
        
        int[] result = new int[size];
        int newsize = 0;
        
        for(int i=0; i<size; i++){
        if(array[i] != remove){
            result[newsize] = array[i];
            newsize++;
        }
        }
        
        for(int i=0; i<newsize; i++){
            System.out.print(result[i]+" ");
        }
        
    }
}