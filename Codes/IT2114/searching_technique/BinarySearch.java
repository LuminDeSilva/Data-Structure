import java.util.*;
class BinarySearch
{
	public void BinSearch(int arr[],int searchElement)
	{
		int lowerBound=0;
		int upperBound=arr.length-1;
		int index=arr[0];
		while(upperBound>=lowerBound)
		{
			int middle=(lowerBound+upperBound)/2;
			if(arr[middle]==searchElement)
			{
				System.out.println(middle);          
				break;                            
			}
			else if(searchElement>arr[middle])        
			{
				lowerBound=middle+1;
			}
			else
			{
				upperBound=middle-1;
			}
			
		}
		
		
	}
	
	public static void main(String args[])
	{
		int arr[]={10,14,19,26,27,31,33,35,42,44};
		BinarySearch b=new BinarySearch();
		
		System.out.print("The index of searching element is : ");
		b.BinSearch(arr,19);
	}
}