public class Bubble{  
    public static void bubbleSort(int arr[]){
		
		int n=arr.length;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=1; j<n-i; j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp; 
				}
			}
		}
		
	}
    public static void main(String[] args) {  
                int arr[] ={77,42,35,12,101,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr); 
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  