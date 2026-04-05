
import java.util.*;


public class MAXVAL
{
	public static void main(String[] args) {
		int[] arr = {1,58,56,589,545,55,-5,5};
		
		System.out.println(findMax(arr));
	}
	
	public static int findMax(int[] arr){
	    
	    int max = Integer.MIN_VALUE;
	    
	    for(int i = 0; i< arr.length;i++){
	        if(arr[i] > max){
	            max = arr[i];
	        
	        }
	    
            
	    
	    }
	    return max;
	}
}
