public class QuickSort{
	public static void main(String args[])
	{
		int arr[]={ 2,8,7,1,3,5,6,4  };

		System.out.println("Before the sorting ");

		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]+" ");

		quick(arr,0,arr.length-1);

		System.out.println("After the sorting ");

		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]+" ");


	}
	
	public static void swap(int arr[],int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void quick(int arr[],int start,int end){  
		
		if(start>=end){         
			return;
		}
		
		int i=start,j=end; 
		int pivot=arr[end];
		
		while(i<j)
		{
			while(arr[i]<=pivot && i<j)
			{
				i++;
			}
			
			while(arr[j]>=pivot && i<j)
			{
				j--;
			}
 	
			swap(arr,i,j);
		}
		swap(arr,i,end);
		
		quick(arr,start,i-1);
		quick(arr,i+1,end);
		
		
	}
}