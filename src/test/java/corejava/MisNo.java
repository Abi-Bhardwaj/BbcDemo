package corejava;

public class MisNo {
	public static int diff = 0;
public static void main(String args[]) {
        
        // Given input Array from 1 to n 
        int[] input = {10,9,6,7,4,3,5,1,2}; 
       // int[] input = {1,4,7,13,16}; 
        // Calculate n value  
        diff = input[1] - input[0];
        int n = input.length + 1;
 
        // Calculate Sum of N Number 
        // using Math formula n(n+1)/2 
        int sumOfNNumbers = sumOfAllNNumbers(n);
        
        // Calculate Sum of all numbers in input array
        int sumOfInputArray = sumOfInputArrayNumbers(input);
        
        // Calculate missing number
        // using subtraction
        int missingNumber = sumOfNNumbers - sumOfInputArray; 
 
        // Print the Missing number          
        System.out.println("Missing number in an array is : " 
                                            + missingNumber);
    }
    
    public static int sumOfAllNNumbers(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
    
    public static int sumOfInputArrayNumbers(int[] input){
        int sum = 0;
        for(int i=input[0]; i < input.length ;i+=diff){
            sum = sum + input[i];
        }
        return sum;
    }

}
