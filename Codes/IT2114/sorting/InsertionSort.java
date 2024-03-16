public class InsertionSort {  

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int temp = array[j];  
            int i = j-1;  
            while ( (i >= 0) && ( array [i] > temp ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = temp;  
        }  
    } 
    +
       
    public static void main(String args[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i=0; i<arr1.length; i++){    
            System.out.print(arr1[i]+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);
           
        System.out.println("After Insertion Sort");    
        for(int i=0; i<arr1.length; i++){    
            System.out.print(arr1[i]+" ");    
        }    
    }    
}