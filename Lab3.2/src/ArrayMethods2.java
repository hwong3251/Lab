import java.util.Arrays;

public class ArrayMethods2 extends HelperMethods{
	public static void main(String[]args)
	{
		String[]L1 = {"aa","apple","cc","fetch"};
		String[]L2 = {"bb","bee","dog","frisbee"};
		String[]test = merge(L1, L2);
		printArray(test);
		
		String[]L = {"a","z","d","b","e","c"};
		String[]test2 = mergeSort(L);
		printArray(test2);
	}
	public static String[]merge(String[]list1, String[]list2)
	{
		String[]newArr = new String[list1.length+list2.length];
		int i = 0;
		int j = 0;
		int x = 0;
		while(i < list1.length && j < list2.length)
		{
			if(list1[i].compareTo(list2[j]) < 0)
			{
				newArr[x]=list1[i];
				i++;
				x++;
			}
			else if(list1[i].compareTo(list2[j]) > 0)
			{
				newArr[x]=list2[j];
				j++;
				x++;
			}
			else if(list1[i].compareTo(list2[j]) == 0)
			{
				newArr[x] = list1[i];
				newArr[x+1] = list2[j];
				i++;
				j++;
				x+=2;
			}
		}
		if( i < list1.length)
		{
			for( int k = i;k < list1.length;k++)
			{
				newArr[x] = list1[k];
				x++;
			}
		}
		if( j < list2.length)
		{
			for( int k = j;k < list2.length;k++)
			{
				newArr[x] = list2[k];
				x++;
			}
		}
		return newArr;
	}
	public static String [] mergeSort(String [] list)
	{
		if(list.length == 1)
		{
			return list;
		}
		else
		{
			String[]a1 = Arrays.copyOfRange(list, 0, list.length/2);
			String[]a2 = Arrays.copyOfRange(list, list.length/2, list.length);
			a1 = mergeSort(a1);
			a2 = mergeSort(a2);
			return merge(a1, a2);
		}
	}
	public static int partition(int[]list)
	{
		int n = 0;
		for(int i = 1; i<list.length; i++)
		{
			
		}
		return n;
	}
	
}
