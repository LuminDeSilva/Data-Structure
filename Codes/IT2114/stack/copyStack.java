import java.util.Scanner;

public class copyStack{
	int stackArray[],top,maxSize;
	int fact=1;
	copyStack(int size)
	{
                 maxSize=size;
                 stackArray=new int[maxSize];
                 top = -1;
            }
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else{
			stackArray[++top]=x;
		}
	}
	public int pop()
	{
	int temp=0;
	if(isEmpty())
	{
		System.out.println("Stack is empty");
	}
	else
	{
		temp=stackArray[top];
		top--;
	}
	return temp;
	}
	public boolean isFull()
	{
		return top==maxSize-1;
	}
		public boolean isEmpty()
	{
		return top==-1;
	}
	public void displayStack()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(stackArray[i]+"  ");
		}
	}
	
  public static void main(String [] args)
    {
        copyStack S1=new copyStack(5);
        copyStack temp=new copyStack(5);
        copyStack S2=new copyStack(5);
        
     S1.push(1);
     S1.push(2);
     S1.push(3);
     S1.push(4);
     S1.push(5);
     
	   //S1.displayStack();
	  
	   
     temp.push(S1.pop());
     temp.push(S1.pop());
     temp.push(S1.pop());
     temp.push(S1.pop());
     temp.push(S1.pop());
     
     S2.push(temp.pop());
     S2.push(temp.pop());
     S2.push(temp.pop());
     S2.push(temp.pop());
     S2.push(temp.pop());
	 
	 
	System.out.println("Elements of copy stack : ");
	 S2.displayStack();
    }
             
}

