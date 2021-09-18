// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

// Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.

 import java.io.*;
import java.util.*;

public class LongestConsecutiveSequenceOfElements{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn  = new Scanner(System.in);
    
    int n = scn.nextInt();
    
    int[] arr  = new int[n];
    
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    
    HashMap<Integer, Boolean> hm = new HashMap<>();
    
    for(int val : arr){
        hm.put(val,true);
    }
    
    for(int val : arr){
        if(hm.containsKey(val - 1)){
            hm.put(val,false);
        }
    }
    
    
    int msp = 0;
    int ml = 0;
    
    for(int val : arr){
        
        if(hm.get(val) == true){
            
            int tl = 1;
            int tsp = val;
            
            while(hm.containsKey(tsp + tl)){
                tl++;
            }
            
            if(tl > ml){
                msp = tsp;
                ml = tl;
            }
        }
        
    }
    
    for(int i = 0; i < ml; i++){
        System.out.println(msp + i);
    }
    
 }

}