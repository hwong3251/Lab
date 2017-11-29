
public class ArrayMethods3 extends HelperMethods{
	public static void main(String[]args)
	{
		int[] test1 = {1,3,2,4,6,5};
		double[] test2 = {1.2, 1.4, 1.0, 2.2, 8.1, 0.2};
		String[]test3 = {"ab","b","a","bc","c","cd"};
		
		insertionSort(test1);
		selectionSort(test2);
		bubbleSort(test3);
		
		System.out.println("insertionSort");
		printArray(test1);
		System.out.println("selectionSort");
		printArray(test2);
		System.out.println("bubbleSort");
		printArray(test3);
		
	}
	public static void insertionSort(int[]list1)
	{
		for ( int i = 0; i < list1.length; i++)
		{
			for ( int j=i; j> 0; j--)
			{
				if(list1[j] < list1[j-1])
				{
					swap(list1,j,j-1);
				}
			}
		}
	}
	public static void selectionSort(double[]list1)
	{
		double min;
		int index = 0;
		for ( int j = 0; j < list1.length; j++)
		{
			min = list1[j];
			for ( int i=j; i < list1.length; i++)
			{
				if(list1[i] < min)
				{
					min = list1[i];
					index = i;
				}
			}
			swap(list1,index,j);
		}
	}
	public static void bubbleSort(String[]list1)
	{
		boolean swap = true;
		while(swap)
		{
			int count = 0;
			for(int i = 0; i < list1.length-1; i++)
			{
				if(list1[i].compareTo(list1[i+1])>0)
				{
					swap(list1,i+1,i);
					count++;
				}
			}
			if(count == 0)
			{
				swap = false;
			}
		}
	}
}
