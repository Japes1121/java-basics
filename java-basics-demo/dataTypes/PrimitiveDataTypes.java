/**
 * 
 */
package dataTypes;

/**
 * @author Jayaprakash
 *
 */
public class PrimitiveDataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=100;
		short s=-1000;
		int i=100;
		long l=100l;

		float f=100.1f;
		double d=100.0d;
		
		char charWithChar = 'A';
		char charWithNumber = '\u0068';
		
		System.out.println("Byte: "+b);
		System.out.println("Short: "+s);
		System.out.println("Int: "+i);
		System.out.println("Long: "+l);
		System.out.println("Float: "+f);
		System.out.println("Double: "+d);
		System.out.println("Char With Char: "+charWithChar);
		System.out.println("Char With Number: "+charWithNumber);
		
		//Explicit Type Conversion 
		
		byte typeConvo=(byte) s;
		System.out.println("Short to Byte : "+typeConvo);
		
	}

}
