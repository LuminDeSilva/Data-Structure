public class Linear {  

    public static int LinearSearch(int array[], int target) {  
        int n = array.length;
		int j;
		boolean found=false;
        for (j = 0; j < n; j++) {  
              
            if(array[j]==target){
				found=true;
				break;
			}
					
        }
			if(found)
				return j;
			else
				return -1;
    } 


	

       
    public static void main(String args[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        
        System.out.println();    
            
        System.out.println("the search result is : " + LinearSearch(arr1,43));
           
           
          
    }    
}