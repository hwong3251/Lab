
public class ArrayMethods3 extends HelperMethods{
	public static void main(String[]args)
	{
		String[]test1 = {"apple","banana","a","cat","zebra","leon"};
		bubbleSort(test1);
		printArray(test1);
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
