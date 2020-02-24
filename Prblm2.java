/**
 * 
 */
package ProjectEluer;

/**
 * @author DELL
 *
 */
public class Prblm2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int first =1;
		int  second =1;
		int next=0;
		int sum =0;
		while(next<4000000)
		{
		next = first+second;
		first = second;
		second = next;
		if((next%2)==0)
		{
			sum = sum+next;
		}

		// TODO Auto-generated method stub
		
	}
		System.out.println(sum);
	

	}
}
