public class CopyQueue {
    int maxSize,rear,front,queueArray[],nItem;
    
CopyQueue(int size)
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
    { 
		return front>rear;
	}
 
 public void displayQ()
    { 
	for(int i=front; i<=maxSize-1;i++)           
        System.out.print(queueArray[i]+" ");
    }
	

public static void main(String []args)
    {
        CopyQueue Q= new CopyQueue(5);
        CopyQueue Qc= new CopyQueue(5);
         
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        Q.enqueue(5);
        
		System.out.println("The original queue elements are :" );
		Q.displayQ();
		System.out.println();
		
            Qc.enqueue(Q.dequeue());
            Qc.enqueue(Q.dequeue());
            Qc.enqueue(Q.dequeue());
            Qc.enqueue(Q.dequeue());
            Qc.enqueue(Q.dequeue());
			
		System.out.println("The copy queue elements are : ");
		Qc.displayQ();
        }
}