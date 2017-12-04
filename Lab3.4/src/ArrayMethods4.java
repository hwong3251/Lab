
public class ArrayMethods4 extends HelperMethods {
	public static void main(String[]args)
	{
		int[]test1 = {1,12,5,26,7,14,3,7,2};
		test1 = partition(test1,0,test1.length-1);
		System.out.println(t);
	}
	public static int partition(int[]list,int front,int back)
	{
		int i = 0;
		int j = i;
		int pivotPos = 0;
		int pivot = list[front];
		while( i < list.length)
		{
			while(list[i] <= pivot && i < pivot)
			{
				i++;
			}
			while( list[j] > pivot && i < back)
			{
				j++;
			}
			swap(list,i,j);
			pivotPos = i;
		}
		swap(list,pivotPos,0);
		return pivotPos;
	}
	public static void quickSort(int[]list1, int front, int back)
	{
		
	}
	public static void customSort()
	{
		
	}
}
