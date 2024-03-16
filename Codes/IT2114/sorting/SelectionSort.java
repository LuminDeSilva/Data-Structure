public class SelectionSort{
	
	public static void selectionSorting(int arr[])
	{
		int n=arr.length;
		
		for(int i=0; i<n-1; i++)
		{
			int min=i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[min]>arr[j])
					min=j;
			}
			
			if(min!=i)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}
	
	public static void main(String args[]){
		int ar[]={9,14,3,2,43,11,58,22};
		
		System.out.println("Before Selection Sort");    
        for(int i=0; i<ar.length; i++){    
            System.out.print(ar[i]+" ");    
        }    
        System.out.println();
		
		selectionSorting(ar);
		
		System.out.println("After Selection Sort");
		
		for(int i=0; i<ar.length; i++)
			System.out.println(ar[i]);
	}
}