
public class ArrayMethods2 extends HelperMethods{
	public static void main(String[]args)
	{
		String[]L1 = {"a","c"};
		String[]L2 = {"a","b"};
		String[]test = merge(L1, L2);
		printArray(test);
		String apple = "aa";
		String banana = "ab";
		System.out.println(apple.compareTo(banana));
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
				x = x + 2;
			}
		}
		/*
		for(int z = 0; z < newArr.length; z++)
		{
			if(newArr[z]==null)
			{
				newArr[z]=list2[j];
			}
		}
		*/
		return newArr;
	}
	
}
