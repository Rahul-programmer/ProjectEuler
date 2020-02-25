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
		BigInteger sum = new BigInteger("2");
		
		for(int i =3;i<2000000;i++)
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
		int k =(int) Math.sqrt(no);
	 for(int i=2;i<=k;i++)
	 {
		 if(no%i==0)
		 {
			 return false;
		 }
	 }
	 	return true;
		
	}
		

}
/*OUTPUT-142913828922*/
