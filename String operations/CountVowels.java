
import java.util.*;


public class CountVowels
{
	public static void main(String[] args) {
	    
	    String word = "abcdefghijkl";
	    System.out.println(countVowels(word));
	    
	}
	
	public static int countVowels(String word){
	    
	    int count = 0;
	    char[] arr = word.toCharArray();
	    char[] vowels = {'a','e','i','o','u'};
	    
	    for(int i = 0; i<arr.length; i++){
	        for(int j = 0;  j<vowels.length;j++){
	            if(arr[i] == vowels[j]){
	                count++;
	            }
	        }
	        
	    }
	    
	    
	    
	    return count;
	}
}
