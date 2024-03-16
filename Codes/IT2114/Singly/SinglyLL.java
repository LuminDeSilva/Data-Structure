
class SinglyLL{
		ChainNode head;
		 int size;
	SinglyLL()
	{
		this.head=null;
		this.size=0;
	}	
	public boolean isEmpty()
	{
		return head==null;
	}
	public int size()
	{
		return this.size;
	}
public void addFirst(Object elt)
{
	if(isEmpty())
		head=new ChainNode(elt);
	else
		head=new ChainNode(elt,head);
	size++;
}

public void addLast(Object elt)
{
	if(isEmpty())
		head=new ChainNode(elt);
	else
	{	ChainNode tmp=head;
		while(tmp.next!=null)
		tmp=tmp.next;
		tmp.next=new ChainNode(elt);
	}
	size++;
}

public Object removeFirst()
{	Object rmdata=null;
	if(isEmpty())
		System.out.println("List is empty");
	else
	{	rmdata=head.data;
		head=head.next;
		size--;
		}
		return rmdata;
}

public Object removeLast()
{
	Object rmdata=null;
	if(isEmpty())
		System.out.println("List is empty");
	else
	{
		if(size==1)
		{rmdata=head.data;
		head=null;}
		else
		{
			ChainNode tmp=head;
			while(tmp.next.next!=null)
				tmp=tmp.next;
				rmdata=tmp.next.data;
				tmp.next=null;
		}
		size--;
	}
		return rmdata;
}

public int searchDATA(Object e)				//getindex
{
	int index=-1;
	if(isEmpty())
		System.out.println("empty list");
	else
	{
		int i=0;
		ChainNode tmp=head;
		while(tmp!=null && tmp.data!=e)
		{
			tmp=tmp.next;
			i++;
		}
		
		if(tmp!=null)
		{
			index=i;
			System.out.println(e+ " index is "+i);
		}
		else
			System.out.println( e+ " does not available");
	}
	return index;
}
	
public void insertAfter(Object e,Object after)
{
	
	if(isEmpty())
		System.out.println("empty list");
	else
	{
		ChainNode tmp=head;
		while(tmp!=null && tmp.data!=after)
		{
			tmp=tmp.next;
		}
		
		if(tmp==null)
		{
			System.out.println(after+ " element is dosent exit in the list");
		}
		else
		{
			tmp.next=new ChainNode(e,tmp.next);
			size++;
			
		}
	}
	

}	
	
	
public void insertBefore(Object e,Object before){
		
		if(isEmpty())
		{
			System.out.println("the list is empty");
		}
		
		else if(head.data==before){
			
			
			ChainNode newNode=new ChainNode(e,head);
			head=newNode;
			
		}
		
	
		else{
			ChainNode tmp=head;
			
			while(tmp.next!=null && tmp.next.data!=before)
			{
				tmp=tmp.next;
			}
			
			if(tmp.next==null)
				System.out.println("the element "+ before +" is not in the List");
			
			else{
				ChainNode newNode=new ChainNode(e,tmp.next);
				tmp.next=newNode;
			}
			
		}
		
		size++;
		
	}
	
public boolean checkIndex(int index)
{
	if(index < 0 || index >= size)
		return false;
	else
		return true;
}

public Object getData(int index)
{
	Object iData=null;
	if(checkIndex(index))
		
	{	ChainNode tmp=head;
		for(int i=0;i<index;i++)
			tmp=tmp.next;
		iData=tmp.data;
	}
	else
	System.out.println(index+" position not found ");
 return iData; 
}

public void print()
{
	if(isEmpty()){
	
		System.out.println("empty list");
	
	}else
	{
		ChainNode tmp=head;
		while(tmp!=null)
		{
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		System.out.println();
	}
}
	
public void insertNode(int index,Object e)
{	if(index>=0 && index<size)
	{
		if(index==0)
		{
			head=new ChainNode(e,head);
			size++;
		}
		else
		{
			ChainNode tmp=head;
			for(int i=0;i<index-1;i++)
				tmp=tmp.next;
			tmp.next=new ChainNode(e,tmp.next);
		}
	}
	else if(size==0)
		{
			head=new ChainNode(e);
				size++;
		}
		else 
		{
			System.out.println("given index not available");
		}
}

public static void main ( String[] args)
{
	SinglyLL A=new SinglyLL();
	
	A.addFirst(12);
	A.addFirst(23);
	A.addLast(14);
	A.addLast(26);
	A.print();
	
	//A.removeFirst();
	//A.removeLast();
	
	A.insertAfter(30,12);
	A.insertBefore(20,14);
	
	System.out.println(A.getData(3));
	A.searchDATA(26);
	A.insertNode(2,100);
	A.print();
	
	}
}		

