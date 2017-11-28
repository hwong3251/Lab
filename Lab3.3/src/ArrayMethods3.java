
public class ArrayMethods3 extends HelperMethods{
	public static void main(String[]args)
	{
		String[]test1 = {"ab","b","a","bc","c","cd"};
		int[] test2 = {1,3,2,4,6,5};
		double[] test3 = {1.1,1.2,2.1,2.2,3.1,3.2};
		
		bubbleSort(test1);
		insertionSort(test2);
		selectionSort(test3);
		
		printArray(test1);
		printArray(test2);
		printArray(test3);
	}
	public static void insertionSort(int[]list1)
	{
		int n = 1;
		while(n < list1.length)
		{
			for(int i = 0; i < n; i++)
			{
				if(list1[n]<list1[i])
				{
					swap(list1,n,i);
				}
			}
			n++;
		}
	}
	public static void selectionSort(double[]list1)
	{
		double lowest = list1[0];
		for(int i = 0;i<list1.length;i++)
		{
			for(int j = i+1;j<list1.length;j++)
			{
				if (list1[j]<lowest)
				{
					lowest = list1[j];
				}
			}
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
