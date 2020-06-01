/*The sum of the squares of the first ten natural numbers is,

12+22+...+102=385
The square of the sum of the first ten natural numbers is,

(1+2+...+10)2=552=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
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
		int n =100;
		
		sum1 = (n*(n+1))/2;
		sum1=sum1*sum1;
		sum2 = (n*(n+1)*((2*n)+1))/6;
		diff = sum1-sum2;
		System.out.println(diff);
	

}
	

}
/*OUTPUT-25164150*/
