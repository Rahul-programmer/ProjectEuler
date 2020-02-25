
/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
/**
 * 
 */
package ProjectEluer;

/**
 * @author DELL
 *
 */
public class prblm9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int limit =500;
		int m,n,a,b,c;
		for( m=1;m<limit;m++) {
			for(n=(m+1);n<limit;n++)
			{
				a=(n*n)-(m*m);
				b=2*m*n;
				c=(n*n)+(m*m);
				if(a+b+c=1000)
				{
					System.out.println(a*b*c);
				}
			}
		}
		

	}

}
/*OUTPUT-31875000*/
