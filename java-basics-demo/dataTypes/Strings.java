package dataTypes;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayString();
		FormatString();

	}
	
	private static void ArrayString()
	{
		char[] charTest={'J','P'};
		String[] test={"Jayaprakash",".","J"};
		String nickName=new String(charTest);
		System.out.println(nickName);
		
		//String name=Arrays.toString(test);
		String name=String.join("", test);
		System.out.println(name);
	}
	
	private static void FormatString()
	{
		String name="Jayaprakash",company="Infosys";
		int exp=2;
		String format=String.format("I am %s."+"Currently working in %s "
				+ "with experience of %d years.", name,company,exp);
		System.out.println(format);
	}

	private static void functions()
	{
		
	}
}
