//Find factorial of a large number
import java.math.BigInteger;
import java.util.Scanner;
public class large_no_factorial
{

	//declaring BigInteger class with factiral function
	public static BigInteger Factorial(int n)
	{
		//initializing BigInteger
		BigInteger bg = new BigInteger("1"); //instead of 1 BigInteger Constant BigInteger.ONE can also be used

		//for loop to calculate factorial
		//for loop can be start with either 1 or 2
		for(int i=2; i<=n; i++)
		{
			//use in built function of BigInteger.multiply() 
			bg = bg.multiply(BigInteger.valueOf(i));
		}
		return bg;

	}
	public static void main(String[] args) {
		int n = 100;
		System.out.print(Factorial(n));
	}
}