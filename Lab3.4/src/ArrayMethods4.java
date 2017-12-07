
public class ArrayMethods4 extends HelperMethods {
	public static void main(String[]args)
	{
		int[]test1 = {1,5,26,7,14,3,7,2};
		quickSort(test1,1,7);
		printArrayInt(test1);
	}
	private static int partition(int[] list, int front, int back)
	{
	    int pivot = list[front];
	    int low = front + 1;
	    int high = back;
	    while (high > low) 
	    {
	    	while (low <= high && list[low] <= pivot)
	    	{
		    	low++;
	    	}
			while (low <= high && list[high] > pivot)
			{
		        high--;
			}
			if (high > low)
			{
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
	    }
	    while (high > front && list[high] >= pivot)
	    {
	    	high--;
		}
	    if (pivot > list[high]) 
	    {
	    	list[front] = list[high];
	        list[high] = pivot;
	        return high;
	    }
	    return front;
    }
	public static void quickSort(int[]list1, int front, int back)
	{
		 if (front < back)
	     {
	           
	         int pi = partition(list1, front, back);
	         quickSort(list1, front, pi-1);
	         quickSort(list1, pi+1, back);
	     }
	}
	public static void customSort()
	{
		
	}
}
