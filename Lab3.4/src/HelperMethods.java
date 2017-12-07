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
	public static void printArrayInt(int[] test2)
	{   
	    for(int i = 0; i < test2.length; i++)
	    {
	        System.out.print("["+test2[i]+"]");
	    }
	    System.out.print("\n");
	}
	public static void printArray(double[] test3) {
		for(int i = 0; i < test3.length; i++)
		{
		    System.out.print("["+test3[i]+"]");
		}
		System.out.print("\n");
	}
	public static void printArray(String[] test1)
	{   
	    for(int i = 0; i < test1.length; i++)
	    {
	        System.out.print("["+test1[i]+"]");
	    }
	    System.out.print("\n");
	}
	public static void swap(String[]arr,int i,int j)
	{
		String n = arr[i];
		arr[i] = arr[j];
		arr[j] = n;
	}
	public static void swap(double[]arr , int i, int j) 
	{
		double n = arr[i];
		arr[i] = arr[j];
		arr[j] = n;
	}
	public static void swap(int[]arr,int i,int j)
	{
		int n = arr[i];
		arr[i] = arr[j];
		arr[j] = n;
	}
}
