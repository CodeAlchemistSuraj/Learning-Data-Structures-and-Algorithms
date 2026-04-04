/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class ReverseString
{
	public static void main(String[] args) {
		System.out.println(reverseString("Hello"));
	}

	public  static String reverseString(String word) {

		char[] arr = word.toCharArray();
		int left = 0;
		int right = arr.length-1;

		while(left<right) {

			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		return new String(arr);

	}
}