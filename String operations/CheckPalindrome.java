
import java.util.*;


public class CheckPalindrome
{
	public static void main(String[] args) {
	    
	    String word = "sumna";
	    System.out.println(checkPalindrome(word));
	   
		
	}
	


    public static boolean checkPalindrome(String word){
        char[] arr = word.toCharArray();
        
        int right = arr.length-1;
        int left = 0;
        
        while(left<right){
            if(arr[left]!=(arr[right])){
                return false;
            }else{
                left++;
                right--;
            }
            
            
        }
        return true;
    }
}
