package arrays;
import java.util.Arrays;;
public class ArrayMethods {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] intArray={10,60,40,90,5,1};
			int[] intArray1={60,10,1,5,90,40};
			double[] doubleArray={1.5,7.9,1,0.6};
			
			System.out.println("Array Before sort");
			for(int num: intArray)
			{
				System.out.println(num);
			}
		Arrays.sort(intArray);
		System.out.println("Array after sort");
		for(int num: intArray)
		{
			System.out.println(num);
		}
		
		int search=Arrays.binarySearch(intArray, 60);
		System.out.printf("Searched Element : %d",search);
		System.out.println("");
		
		Arrays.sort(intArray1);
		System.out.println(Arrays.equals(intArray, intArray1));
		
		Arrays.fill(intArray, 523);
		System.out.println("Array after filling");
		for(int num: intArray)
		{
			System.out.println(num);
		}
		
	}

}
