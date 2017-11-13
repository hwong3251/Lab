
public class ArrayMethods extends HelperMethods {
	public static void main(String[] args)
	{
		int[] random = {1,2,3,4,1,5,5};
		removeDuplicates(random);
		//System.out.println(random.length);
	}
	
	public static void removeDuplicates(int [] list)
	{
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
		//printArray(mask);
		for(int i = 0; i< newArr.length; i++)
		{
			for(int j = 0; j<mask.length; j++)
			{
				if(mask[j]==1)
				{
					newArr[i] = list[j];
				}
			}
		}
		printArray(newArr);
	}
	public static void printArray(int[] myData)
	{   
	    for(int i = 0; i < myData.length; i++)
	    {
	        System.out.print(myData[i]);
	    }
	}
}
