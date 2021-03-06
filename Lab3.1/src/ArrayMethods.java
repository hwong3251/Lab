/**
 * 
 * @author Leon You, Hoi Lam Wong
 *
 */
public class ArrayMethods extends HelperMethods {
	public static void main(String[] args)
	{
		int[]random = {1,4,1,5,6};// 4156
		int[]newArr = removeDuplicates(random);
		printArray(newArr);
		
		int[]arr1 = {1,2,4,6,8};
		int[]arr2 = {1,2,3};
		productArray(arr1, arr2);
		System.out.println();
		
		int[][]pArr = pascalTriangle(8);
		printPascalTriangle(pArr);
	}
	
	public static int[] removeDuplicates(int [] list)
	{
		//printArray(list);
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
		int count = 0;
		for(int i = 0; i< list.length; i++)
		{
			if(mask[i]==1)
			{
				newArr[count] = list[i];
				count++;
			}
		}
		return newArr;
	}
	public static int[][]productArray(int[]arr1, int[]arr2)
	{
		int[][]newArr = new int[arr1.length][arr2.length];
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr2.length; j++)
			{
				newArr[i][j] = arr1[i]*arr2[j];
			}
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr2.length; j++)
			{
					System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
		return newArr;
	}
	public static int[][]pascalTriangle(int n)
	{
		int[][] newArr = new int[n][];
		for(int i = 0; i < n; i++)
		{
			newArr[i] = new int[i+1];
			newArr[i][0] = 1;
			newArr[i][newArr[i].length-1] = 1;
			for(int j = 1; j < i; j++)  
			{
				newArr[i][j] = newArr[i-1][j-1]+newArr[i-1][j];
			}
		}
		return newArr;
	}
	public static void printPascalTriangle(int[][]pTriangle)
	{
		for (int i = 0; i < pTriangle.length; i++)
		{
			int x = i;
			while(x < pTriangle.length-1)
			{
				System.out.print("  ");
				x++;
			}
			for (int j = 0; j < pTriangle[i].length; j++)
			{
				System.out.print("["+pTriangle[i][j]+"]");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}