
public class HelperMethods {
	public static int[]copyArray(int[]intArray)
	{
		int[]copy = new int[intArray.length];
		for(int i = 0; i<intArray.length; i++)
		{
			copy[i] = intArray[i];
		}
		return copy;
	}
	public static void printArray(int[]arr)
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print("[" +arr[i]+"]");
		}
		System.out.println();
	}
	public static int findDuplicates(int[]arr)
	{
		for(int i = 0; i<arr.length-1;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					return arr[i];
			}
		}
		return -1;
	}
}
