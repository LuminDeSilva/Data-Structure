import java.util.Scanner;
public class Stack {
		
    int maxSize,top;
	String stackArray[];
		
Stack(int size){
    maxSize=size;
    top=-1;
     stackArray =new String [maxSize] ;      }
	 
	 
public void push(String x)
  {if(isFull())
    {System.out.println("the stack is full");
            }
 else
  { stackArray[++top]=x;
    }
  }
  
 
 public String pop(){
 String temp=" ";
    if(isEmpty())
        System.out.println("the stack is Empty" );
    else
        {temp=stackArray[top];
        top--;}
    return temp;
    }

	public String peek()
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
	
	public static void main(String args[]){
		Stack s1=new Stack(5);
		
		s1.push("apple");
		s1.push("orange");
		s1.push("car");
		s1.push("cat");
		s1.push("dog");
		//s1.push(6);
		
		s1.pop();
		s1.pop();
		
		//System.out.println(s1.peek());
		
		s1.displayS();
		//System.out.println(s1.isEmpty());
		//System.out.println(s1.isFull());
		
	}
 }
