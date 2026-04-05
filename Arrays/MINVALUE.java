
import java.util.*;


public class MINVALUE
{
	public static void main(String[] args) {
	    
	    int[] arr = {1,5,8,9,-9,0,8};
	    System.out.println(findMinVal(arr));
	    
	}
	
	public static int findMinVal(int[] arr){
	    
	    int min = Integer.MAX_VALUE;
	    
	    for(int i = 0; i<arr.length;i++){
	        if (arr[i] < min  ){
	            min = arr[i];
	        }
	        
	    }
	    return min;
	    
	    
	}
}
