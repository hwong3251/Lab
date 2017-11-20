public abstract class HelperMethods {
	public static int[]copyArray(int[]intArray)
	{
		int[]copy = new int[intArray.length];
		for(int i = 0; i<intArray.length; i++)
		{
			copy[i] = intArray[i];
		}
		return copy;
	}
	public static int Duplicates(int[]arr)
	{
		int n = 0;
		for(int i = 0; i<arr.length-1;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					n++;
			}
		}
		return n;
	}
	public static int countUnique(int[]numbers)
	{
		int count = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			//Assume the number is unique at first
			boolean unique= true;
			
			//Check all the subsequent numbers
			for(int j = i+1; j<numbers.length; j++)
			{
				if(numbers[i] == numbers[j])
				{
					unique = false; //If we found an equivalent number, unique is false
					break; // No need to check the rest of the inner for-loop
				}
			}
			//If unique stayed true, we add 1 to the unique count
			if(unique)
			{
				count ++;
			}
		}
		return count;
	}
	public static void printArray(String[]test)
	{   
	    for(int i = 0; i < test.length; i++)
	    {
	        System.out.print("["+test[i]+"]");
	    }
	    System.out.print("\n");
	}
	public static String[] everyOther (String[]list1, String[]list2)
	{
		String [] result = new String[list1.length+list2.length];
		int index = 0;
		for (int i = 0; i<list1.length && i<list2.length; i++)
		{
			result[index] = list1[i];
			result[index+1] = list2[i];
			index += 2;
		}
		if(list1.length > list2.length)
		{
			for(int j = list2.length; j<list1.length; j++)
			{
				result[index] = list1[j];
			}
		}
		else
		{
			for(int j = list1.length; j<list2.length; j++)
			{
				result[index] = list2[j];
			}
		}
		return result;
	}
	public static void swap(String[]arr,int i,int j)
	{
		String n = arr[i];
		arr[i] = arr[j];
		arr[j] = n;
	}
}
