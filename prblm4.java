/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
/**
 * 
 */
package ProjectEluer;

/**
 * @author DELL
 *
 */
public class prblm4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j;
		int product = 1;
		int largest =1;
		
		
		for(i=999;i>=100;i--)
		{
			for(j=999;j>=100;j--)
			{
				product = i*j;
				
				StringBuilder st = new StringBuilder(""+product);
				String s = ""+product;
				st.reverse();
				if(s.equals(st.toString()) && largest<product) {
                    largest = product;
				
			}
		}
	}
		System.out.println(largest);
}
}
/*OUTPUT-906609*/

