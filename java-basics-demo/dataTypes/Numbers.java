/**
 * 
 */
package dataTypes;

import java.lang.*;

/**
 * @author Jayaprakash
 *
 */
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boxing();
		//xxxValueMethod();
		//equalsMethod();
		//valueOfMethod();
		//toStringMethod();
		parseIntMethod();
	}
	
	//example for auto boxing and unboxing
	private static void boxing()
	{
		Integer i=100; //Boxing
		Integer i1=new Integer(50); //Boxing
		int s=i1; //Manual unboxing
		if(i1<i)
		{
			System.out.println("Internal Unboxing");
		}
	}
	
	private static void xxxValueMethod()
	{
		Short l=1000;
		int i=l.intValue(); // intValue returns value in primitive type int from Integer.
							// it will throw error when we try to convert primitive data type to another primitive type
		
		
		Integer s=1000;
		System.out.println(s.compareTo(100)); 
		System.out.println(s.compareTo(1000));
		System.out.println(s.compareTo(1001)); 
	}
	
	//in this function values are automatically typecasted to upper limits
	private static void equalsMethod()
	{
		Integer x = 5;
	    Integer y = 10;
	    Integer z =5;
	    Short a = 5;

	    System.out.println(x.equals(y));  
	    System.out.println(x.equals(z)); 
	    System.out.println(x.equals(a));
	    
	}
	
	private static void valueOfMethod()
	{
		/*This method applicable for INT, STRING only  
		valueOf(int)
		valueOf(String)
		valueOf(String,radix) Radix denotes BInary, decimal, Octal
		*/
		long a = (long)Integer.valueOf(200);
		Integer b = Integer.valueOf("200");
		
		Float f = Float.valueOf("200");
		Long l = Long.valueOf("200");
		Double d = Double.valueOf("200");
		
		Integer c = Integer.valueOf("200",10);
	    System.out.println(a + " " +b +" " + c +" " + f +" " + l +" " + d);
	}
	
	private static void toStringMethod()
	{
		Integer i=100;
		Double d=100000.0;
		Float f=98.123f;
		Long l= 1000000000000000L;
		
		float f1=100.98f;
		System.out.println(i.toString());
		System.out.println(d.toString());
		System.out.println(f.toString());
		System.out.println(l.toString());
		System.out.println(Integer.toString(i));
		System.out.println(Double.toString(d));
		System.out.println(Float.toString(f));
		System.out.println(Long.toString(l));
		System.out.println(i.toString(i, 2));
		
		
	}

	private static void parseIntMethod()
	{
		
	}
	
}
