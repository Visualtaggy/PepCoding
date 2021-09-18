// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. You are required to print all elements of a2 which are also present in a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).
import java.io.*;
import java.util.*;

public class GetCommonElements{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    
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
    
    
    HashMap<Integer,Integer> hm = new HashMap<>();
    
    
    for(int elem : arr1){
        if(hm.containsKey(elem)){
            
            int old_f = hm.get(elem);
            int new_f = old_f + 1;
            hm.put(elem,new_f);
             
        }
        else{
            hm.put(elem,1);
        }
    }
    
    for(int val : arr2){
        if(hm.containsKey(val)){
            System.out.println(val);
            hm.remove(val);
        }

    }
    
    
 }

}