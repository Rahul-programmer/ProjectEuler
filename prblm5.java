/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/

/**
 * 
 */
package ProjectEluer;
import java.math.BigInteger;

/**
 * @author DELL
 *
 */
public class prblm5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		prblm5 ob = new prblm5();
	System.out.println(ob.multiple());

		// TODO Auto-generated method stub

	}
	public static String multiple()
	{
		BigInteger allcm = BigInteger.ONE;
		for(int i =1;i<=20;i++)
		{
			allcm = lcm(BigInteger.valueOf(i),allcm);
		}
		return allcm.toString();

		
	}
	public static BigInteger lcm (BigInteger x,BigInteger y) {
		return x.divide(x.gcd(y)).multiply(y);
	
	}

}



/*OUTPUT-232792560*/

