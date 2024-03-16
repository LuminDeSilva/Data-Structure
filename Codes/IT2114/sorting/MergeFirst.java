import java.util.Arrays;
class MergeFirst
{

	public static void mergeSort(int []array)
	{
		if(array==null)
			return;
		else
		{
			if(array.length>1)
			{
				int mid = array.length/2;

				int left[]=new int[mid];

				for(int i=0; i<mid; i++)
					left[i]=array[i];

				int right[]=new int[array.length-mid];

				for(int i=mid; i<array.length; i++)
					right[i-mid]=array[i]; 

				mergeSort(left);
				mergeSort(right);


				int i=0;
				int j=0;
				int k=0;

				while(i<left.length && j<right.length)   
				{
					if(left[i]<right[j]) 
					{
						array[k]=left[i];
						i++;
					}

					else
					{
						array[k]=right[j]; 
						j++;				
					}
					k++; 

				}

				while(i<left.length)
				{
					array[k]=left[i];
					i++;
					k++;
				}

				while(j<right.length)
				{
					array[k]=right[j];
					j++;
					k++;
				}


			}
		}
	}

	public static void main(String args[])
	{
		int arr[]={ 11, 30, 24, 7, 31, 16, 39, 41 };

		System.out.println("Before the sorting ");

		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]+" ");

		mergeSort(arr);

		System.out.println("After the sorting ");

		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]+" ");


	}

}































/*public class MergeFirst{
	
	public void merge(int a[],int b[],int n,int m)
	{
		int i=0,j=0,k=0;
		
		int c[]=new int[m+n];
		
		while(i<m && j<n)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			
			else{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		
		while(i<m)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		
		while(j<n)
		{
			c[k]=b[j];
			j++;
			k++;
		}
		
		
	}
	
	public void mergeSort(int a[],int lb,int ub)
	{
		if(lb<ub)
		{
			int mid=(lb+ub)/2;
			mergeSort(a,lb,mid);
			mergeSort(a,mid+1,ub);
			merge(a,lb,mid,ub);
		}
		
		
	}
	
	public static void main(String args[])
	{
		int a[]={2,8,15,18};
		int n=a.length;
		int mid=0+(n-1)/2;
		
		int b[]=new int[n-mid+1];
		
		MergeFirst m1=new MergeFirst();
		
		m1.mergeSort(a,0,n);
		
		for (int i = 0; i < n; i++)  
        System.out.print(a[i] + " ");
		
		
	}
}
*/