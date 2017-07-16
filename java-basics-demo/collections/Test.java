package collections;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Test {

	private static void aList()
	{
		List<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		for(int i=0;i<a.size();i++)
		{
			
			System.out.println("I value: "+i + "List size : " +a.size() + " Value : "+a.get(i));
			a.remove(i);
		}
	}
	
	private static void aList1()
	{
		List<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		int len=a.size();
		for(int i=0;i<len;i++)
		{
			System.out.println(a.get(i));
			a.remove(i);
		}
	}
	
	private static void patternDown()
	{
		int space=0,patternLength=9;
		
		for(int i=patternLength;i>=0;i=i-2)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			space+=1;
			System.out.println("");
		}
	}
	
	private static void patternUp()
	{
	
		int patternLength=9,start=1;
		//int space=(int) Math.ceil((float) patternLength / 2)+1;
		int space=patternLength;
		for(int i=start;i<=patternLength;i++)
		{
			for(int j=start;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=start;k<i;k++)
			{
				System.out.print(i);
				System.out.print(" ");
			}
			space-=1;
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aList();
		//aList1();
		patternDown();
		patternUp();		
	}

}
