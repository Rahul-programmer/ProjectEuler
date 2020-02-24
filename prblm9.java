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
		int limit =100;
		for(int a=0;a<limit;a++) {
			for(int b=a+1;b<limit;b++)
			{
				for(int c =b+1;c<limit;c++)
				{
					if((a<b&&b<c&&a+b+c==limit)&&(c*c==a*a+b*b))
					{
						System.out.println(a*b*c);
					}
					
				}
			}
		}
		

	}

}
