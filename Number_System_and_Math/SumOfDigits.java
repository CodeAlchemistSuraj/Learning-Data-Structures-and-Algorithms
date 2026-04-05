
import java.util.*;


public class SumOfDigits
{
	public static void main(String[] args) {
	    
	    int number = 2569856;
	    System.out.println(sumOfDigits(number));
		
	}
	
	
	public static int sumOfDigits(int n){
	    int num = n;
	    int sum = 0;
	    
	    while(num>0){
	        int digit = num%10;
	        sum = sum+=digit;
	        num= num/10;
	        
	    }
	    
	    return sum;
	    
	    
	}

}
