
public class ArrayMethods2 {
	public static void main(String[]args)
	{
		String[]L1 = {"ab","bc"};
		String[]L2 = {"ac","bb"};
		//merge(L1, L2);
		String apple = "aa";
		String banana = "ab";
		System.out.println(apple.compareTo(banana));
	}
	public static String[]merge(String[]list1, String[]list2)
	{
		String[]newArr = new String[list1.length+list2.length];
		for(int i = 0; i < newArr.length; i++)
		{
			int p = list1[i].compareTo(list2[i]);
			if(p < 0)
			{
				newArr[i] = list1[i];
			}
			else if(p > 0)
			{
				newArr[i] = list2[i];
			}
			else
			{
				newArr[i] = list1[i];
				newArr[i+2] = list2[i];
				i++;
			}
		}
		return newArr;
	}
	
}
