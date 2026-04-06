public class FindAverage
{
	public static void main(String[] args) {
		int[] arr = {15,25,26,98,58};
		
		System.out.println(findAverage(arr));
	}
	
	public static double findAverage(int[] arr){
	    int sum = 0;
	    
	    for(int i = 0; i<arr.length;i++){
	        sum+=arr[i];
	    }
	    
	    return (double) sum/arr.length;
	}
}
