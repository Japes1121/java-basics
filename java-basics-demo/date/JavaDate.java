/**
 * 
 */
package date;

import java.util.Date;

/**
 * @author Jayaprakash
 *
 */
public class JavaDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dateMethodPart1();		
	}

	private static void dateMethodPart2()
	{
		Date d=new Date();
		
		System.out.println(d);
		System.out.println(d.toString());
		
		Date d1=new Date(1490000000000l);
		System.out.println(d1);
		System.out.println(d1.toString());
	}
	private static void dateMethodPart1()
	{
		Date d=new Date();
		System.out.println(d.toString());
	}
}
