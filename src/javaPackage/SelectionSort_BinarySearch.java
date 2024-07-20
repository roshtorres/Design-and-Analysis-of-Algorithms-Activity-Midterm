package javaPackage;
import java.util.Scanner;

public class SelectionSort_BinarySearch 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//List Length
		System.out.print("Enter the list length: ");
		int listLength = input.nextInt();
		int[] list = new int[listLength];
		
		//Items in the List
		System.out.println("Enter the items in the List:");
		for(int i = 0;  i < listLength; i++)
		{
			list[i] = input.nextInt();
		}
		
		System.out.println();
		
		//List
		System.out.print("List: ");
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	        
	   //Selection Sort
	   System.out.println("\n\n-----Selection Sort-----");
	   selectionSort(list);
	   System.out.print("Sorted List: ");
	   for(int i = 0; i < list.length; i++)
		   System.out.print(list[i] + " ");

	   //Binary Search
	    System.out.println("\n\n-----Binary Search-----");
		System.out.print("Search Item: ");
		int searchItem = input.nextInt();
		int index = binarySearch(list, list.length, searchItem);
		System.out.print("Index Position: ");
		if(index != -1)
		{
			System.out.println("Item found at [" + index + "]");
		}
		else
		{
			System.out.println("Item does not found");
		}
		
	}
	
	//selectionSort()
    public static void selectionSort(int list[])
    {
        for (int i = 0; i < list.length - 1; i++)
        {
            int k = i;
            
            for (int j = i + 1; j < list.length; j++)
            {
                if (list[j] < list[k])
                {
                    k = j;
                }
            }
            
            int smallerNumber = list[k];
            list[k] = list[i];
            list[i] = smallerNumber;
        }
        
    }

	//binarySearch()
	public static int binarySearch(int[] list, int listLength, int searchItem)
    {
        int first = 0;
        int last = listLength - 1;
        int mid = 0;
        boolean found = false;
        
        while (first <= last && !found)
        {
            mid = (first + last)/2;
            
            if (list[mid] == searchItem)
            {
                found = true;
            }
            else if (list[mid] > searchItem)
            {
                last = mid - 1;
            }
            else
            {
                first = mid + 1;
            }
        }
        
        if (found)
        {
            return mid;
        }
        else
        {
            return -1;
        }
        
    }
	
}
