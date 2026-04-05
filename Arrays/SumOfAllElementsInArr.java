
import java.util.*;


public class SumOfAllElementsInArr
{
	public static void main(String[] args) {
	    
	    int[] arr = {1,5,8,9,-9,0,8};
	    System.out.println(sumOfAll(arr));
	    
	}
	
	public static int sumOfAll(int[] arr){
	    
	    int sum = 0;
	    
	    for(int i = 0; i<arr.length;i++){
	        
	        sum+=arr[i];
	    }
	    return sum;
	    
	    
	}
}
