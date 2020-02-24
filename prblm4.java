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
		
		
		for(i=100;i<999;i++)
		{
			for(j=100;j<999;j++)
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
