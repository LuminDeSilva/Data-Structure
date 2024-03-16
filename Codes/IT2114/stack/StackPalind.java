/*
write a program to check whether a string is palindrome or not using stack class
  read a string from user
  then find the reverse for that string
  display whether that string is palindrome or not
  eg:
  madam
  mom
*/

import java.util.Scanner;
public class StackPalind {
	
	
    int maxSize,top;
	char stackArray[];
	
	
StackPalind(int size){
    maxSize=size;
    top=-1;
     stackArray =new char [maxSize] ;      }
	 
	 

public void push(char x)
  {if(isFull())
    {System.out.println("the stack is full");
            }
 else
  { stackArray[++top]=x;
    }
  }
  
  
 
 public char pop(){
 char temp=' ';
    if(isEmpty())
        System.out.println("the stack is Empty" );
    else
        {temp=stackArray[top];
        top--;}
    return temp;
    }
	
	
	
	public char peek()
	{
		return stackArray[top];
	} 
	
	
 
 public boolean isFull()
    { return top==maxSize-1; }
	
	
 
 public boolean isEmpty()
    { return top==-1; }
	
	
 
 public void displayS()
    { for(int i=0;i<=top;i++)
        System.out.print(stackArray[i]+" ");
    }
	

	public static void main(String []args)
    {
        
		
		String word;
        
        Scanner sc=new Scanner(System.in);
		boolean isPalindrome=true;
        
        System.out.println("Enter the String:");
        word=sc.nextLine();
        
        int l=word.length();
		
		StackPalind s= new StackPalind(l);
        
        
		char origi[]=new char[l];
		
        for(int i=0;i<l;i++)
        {
            origi[i]=word.charAt(i);
        }
						
        for(int i=0;i<l;i++)
        {
            s.push(origi[i]);
        }
		
		
       
        for(int i=0;i<l;i++)
        {
            if(s.pop()!=origi[i])
			{
				isPalindrome=false;
				break;
			}
			
			else
				isPalindrome=true;
            
            
        }
        
        if(isPalindrome==true)
        
            System.out.println("the input is palindrome");
        
            else
            System.out.println("the input is not palindrome");
        
    }
 }
