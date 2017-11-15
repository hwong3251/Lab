
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
	public static void printArray(int[] myData)
	{   
	    for(int i = 0; i < myData.length; i++)
	    {
	        System.out.print(myData[i]);
	    }
	    System.out.print("\n");
	}
	public static void printArray(int[][]arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
