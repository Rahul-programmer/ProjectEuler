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
		int count =1;
		for(int i =3;i>0;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j!=0)
				{
					count ++;
				}
			}
			if(count ==10001)
			{
				System.out.println(i);
				break;
				
			}
		}
		// TODO Auto-generated method stub

	}

}
