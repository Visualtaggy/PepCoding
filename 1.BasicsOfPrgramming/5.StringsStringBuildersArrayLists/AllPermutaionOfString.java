import java.util.*;
public class AllPermutaionOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the string: ");
		String str = scn.next();
		solution(str);
        scn.close();
    }
    public static void solution(String str){
		// write your code here
		
		int string_length = str.length();
		int string_factorial = factorial(string_length);
		
		
		//The loop runs as many factorials are present
		
		for(int words = 0; words < string_factorial; words++){
		    
		    //Copying original string to make it mutable. also increases performance
		    StringBuilder copy = new StringBuilder(str);
		    //since words here control the loop
		    int tmp = words;
		    
		    //Div for each string
		    for(int div = string_length; div >= 1; div--){
		        int q = tmp / div;
		        int r = tmp % div;
		        
		        System.out.print(copy.charAt(r));
		        copy.deleteCharAt(r);
		        
		        tmp = q;
		    }
		    
		    System.out.println();
		    
		}
	}
    public static int factorial(int n){
	    int answer = 1;
	    if(n < 0){
	        return answer;
	    }
	    else{
	        for(int i = 2; i <= n; i++){
	            answer *= i;
	        }
	        return answer;
	    }
	}
}
