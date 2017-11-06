
public class ArrayMethods {
	public static int[]removeDuplicates(int [] list)
	{
		for(int i = 0; i < list.length-1; i++)
		{
			for(int j = i+1; j <list.length; j++)
			{
				if(list[j]!=list[i])
				{
					int[] list1 = null;
					list1[i]= list[i];
				}		
			}
		}
		return list;
	}
}
