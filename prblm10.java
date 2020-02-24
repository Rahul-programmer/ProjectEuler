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
		boolean flag = false;
	 for(int i=2;i<=(no/2);i++)
	 {
		 if(no%i!=0)
		 {
			 flag =true;
		 }
	 }
	 	return flag;
		
	}
		

}
