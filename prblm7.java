
/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
/**
 * 
 */
package ProjectEluer;

/**
 * @author DELL
 *
 */
public class prblm7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Switch = 1;
		int count =1;
		int prime =0;
		while(Switch==1)
		{
			if(isprime(count))
			{
				count = count+2;
				prime = prime+1;
			}
			else
			{
				count = count+2;
			}
			if(prime==10001)
			{
				Switch =0;
				System.out.println(count-2);
			}
			
			
		}
		
		
		// TODO Auto-generated method stub

	}
	public static boolean isprime(int n)
	{
		int k = (int)Math.sqrt(n);
		
		for(int i=2;i<=k;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		
	}

}
/*OUTPUT-104743*/
