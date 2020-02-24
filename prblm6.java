/**
 * 
 */
package ProjectEluer;

/**
 * @author DELL
 *
 */
public class prblm6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int diff;
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			sum1 =sum1+(i*i);
		}
		for(int i = 1;i<=100;i++)
		{
			 sum = sum+i;
		}
		sum2=sum*sum;
		diff = sum2-sum1;
		System.out.println(diff);
	}

}
