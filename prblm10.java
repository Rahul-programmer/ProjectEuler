/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/
/**
 * 
 */
package ProjectEluer;
import java.math.BigInteger;

/**
 * @author DELL
 *
 */
public class prblm10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("5");
		
		for(int i =5;i<2000000;i++)
		{
			if(isprime(i))
			{
				sum = sum.add(BigInteger.valueOf(i));
			}
		}
		System.out.println(sum);
		
	}
	public static boolean isprime(int no)
	{
		if(no<=1)
		{
			return false;
		}
		if(no<=3)
		{
			return false;
		}
		if(no%2==0||no%3==0)
		{
			return false;
		}
		for(int i =5;i*i<=no;i=i+6)
		{
			
			if(no%i==0||no%(i+2)==0)
			{
				return false;
			}
		}
		return true;
		
 
}
		
		

}
/*OUTPUT-142913828922*/
