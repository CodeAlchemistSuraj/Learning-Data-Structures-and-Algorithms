/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class OddOrEven
{
	public static void main(String[] args) {
		System.out.println(checkOddorEven(52));
	}


    public static String checkOddorEven(int n){
        
        if(n == 0){return "even";}
        if(n%2==0){return "even";}else {return "odd";}
    }
	
}