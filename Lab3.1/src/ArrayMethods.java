
public class ArrayMethods extends HelperMethods {
	public static void main(String[] args)
	{
		int[] random = {1,4,1,2,8,9,8,6,3,4,5,1};
		removeDuplicates(random);
		//System.out.println(random.length);
	}
	
	public static void removeDuplicates(int [] list)
	{
		printArray(list);
		int[]mask = new int[list.length];
		
		int length = countUnique(list);	
		int[]newArr = new int[length];
		for(int i = 0; i<list.length; i++)
		{
			mask[i]=1;
			for(int j = i+1; j<list.length;j++)
			{
				if(list[i]==list[j])
				{
					mask[i] = 0;
					break;
				}
			}
		}
		printArray(mask);
		int count = 0;
		for(int i = 0; i< list.length; i++)
		{
			if(mask[i]==1)
			{
				newArr[count] = list[i];
				count++;
			}
		}
		printArray(newArr);
	}

}
