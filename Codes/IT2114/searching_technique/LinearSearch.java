class LinearSearch
{
	public static void main(String[] args)
	{
		int arr[]={10,14,19,26,27,31,33,35,42,44};
		int index=arr[0];
		boolean found=false;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==33){
			index=i;
			found=true;
			break;
		}
	}
	
	if(found==true)
		System.out.println("The index of the searching element is :"+index);
	
	else
		System.out.println("element not found");
	
	
	
	
	
	
	/*
	
	int i=0;
	
	while(i<arr.length && found!=true)
	{
		if(arr[i]==33)
		
			found=true;
		else
			i=i+1;
	}
	System.out.println("The index of the searching element is :"+i);*/
	}
}