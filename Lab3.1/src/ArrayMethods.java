import java.util.Arrays;
public class ArrayMethods {
	public static void main(String[] args)
	{
		int[] random = {1,2,3,4,1,5,5};
		removeDuplicates(random);
		//System.out.println(random.length);
	}
	
	public static void removeDuplicates(int [] list)
	{
		int duplicateCount = 0;
		for(int i = 0; i < list.length-1; i++)
		{
			for(int j = i+1; j <list.length; j++)
			{
				if(list[j]==list[i])
				{
					duplicateCount++;
					int index = j;
				}
			}
		}
		duplicateCount = duplicateCount*2;
		System.out.println(duplicateCount);
		
		int[]newArr = new int[list.length - duplicateCount];
		System.out.println(newArr.length);
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
