
import java.util.*;


public class CountAllDigits
{
	public static void main(String[] args) {
	    
	    int num = 895896;
	    System.out.println(countAllDigits(num));
	    
	}
	
	public static int countAllDigits(int num){
	    
	    int count = 0;
	    int n = num;
	    while(n>0){
	        int digit =  n%10;
	        count++;
	        n = n/10;
	    }
	    
	    return count;
	}
}
