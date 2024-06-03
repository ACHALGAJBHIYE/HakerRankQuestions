// problem4:
// Write a program to test if an array contains a specific value.

// Input Format

// First line contain size of array second line contain all the input array elements third line contain element to be search

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

// If it is found print true or false

// Program:

import java.io.*;
import java.util.*;

public class problem4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read size
        int size = sc.nextInt();
        
        //read element of an array
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        
        //enter Search element
        int search = sc.nextInt();
        
        boolean found =false;
        for(int i=0; i<size  ; i++){
            if(array[i] == search){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}