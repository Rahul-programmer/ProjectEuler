/**
 * 
 */
package ProjectEluer;

/**
 * @author DELL
 *
 */
public class prblm5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int smallest =0;
		
		
		int flag;
		for(int i =21;i>0;i++)
		{ 
			flag =1;
			for(int j=2;j<=20;j++)
			{
				
				if((i%j)!=0)
				{
					flag =0;
		
					
				}
				
			}
			if(flag ==1)
			{
				smallest = i;
				break;
			}
		}
		System.out.println(smallest);

		// TODO Auto-generated method stub

	}

}
