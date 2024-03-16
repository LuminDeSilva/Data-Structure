import java.util.*;
public class Queue {
    int maxSize,rear,front,queueArray[],nItem;
    
Queue(int size)
    {
     maxSize=size;
     front=0;
     rear=-1;
     queueArray =new int [maxSize] ;      
    }

public void enqueue(int x)
  {if(isFull())
    {System.out.println("the queue is full");
            }
 else
  { queueArray[++rear]=x;
    nItem++;
    }
  }
 
 public int dequeue(){
 int tmp=0;
    if(isEmpty())
        System.out.println("the queue is Empty" );
    else
        {tmp=queueArray[front++];
        nItem--;
        }
    return tmp;
    }
 
 public boolean isFull()
    { return rear==maxSize-1; }
 
 public boolean isEmpty()
    { return front>rear; }
 
 public void displayQ()
    { for(int i=front;i<=maxSize-1;i++)
        System.out.print(queueArray[i]+" ");
    }
 
 
 public static void main(String args[])
	{
		Queue q1=new Queue(600);

        //insert the data to the queue 
        for(int i=0;i<100;i++){
            
        }
		
		

	}
}


