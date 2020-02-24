/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
/**
 * 
 */
package ProjectEluer;

/**
 * @author DELL
 *
 */
public class prblm3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double no = 600851475143d;
		double largest = 2;
		while(no%2==0)
		{
			no=no/2;
			
		}
		for(double i =3;i<Math.sqrt(no);i=i+2)
		{
			while(no%i==0)
			{
				no=no/i;
			}
			
		}
		if(no>largest)
		{
			largest = no;
		}
		System.out.println(largest);
		
	}
	}
	/*OUTPUT-6857*/	
		
