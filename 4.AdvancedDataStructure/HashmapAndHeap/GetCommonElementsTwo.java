// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. You are required to find the intersection of a1 and a2. To get an idea check the example below:
 
// if a1 -> 1 1 2 2 2 3 5
// and a2 -> 1 1 1 2 2 4 5
// intersection is -> 1 1 2 2 5

// Note -> Don't assume the arrays to be sorted. Check out the question video.

import java.io.*;
import java.util.*;

public class GetCommonElementsTwo{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    
    
    // [Taking input]
    int n = scn.nextInt();
    int[] arr1 = new int[n];
    
    for(int i = 0; i < arr1.length; i++){
        arr1[i] = scn.nextInt();
    }
    
    int m = scn.nextInt();
    int[] arr2 = new int[m];
    
    for(int i = 0; i < arr2.length; i++){
        arr2[i] = scn.nextInt();
    }
    
    // [Creating Hashmap]
    
    HashMap<Integer,Integer> hm = new HashMap<>();

    // [ Parsing arr1 and making HashMap]    
    for(int val : arr1){
        if(hm.containsKey(val)){
            int old_f = hm.get(val);
            int new_f = old_f + 1;
            
            hm.put(val,new_f);
            
        }
        else{
            hm.put(val,1);
        }
    }
    
    
    for(int val : arr2 ){
        if(hm.containsKey(val) && hm.get(val) > 0){
            int old_f = hm.get(val);
            int new_f = old_f - 1;

            hm.put(val,new_f);
            System.out.println(val);
        }   
    }
    
    
    
 }

}