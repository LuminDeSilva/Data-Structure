class SinLL{
	
	Node1 head;
	int size;
	
	SinLL(){
		head=null;
		size=0;
	}
	
	public boolean isEmpty(){
		
		return head==null;
	}
	
	public int Size(){
		
		return size;
	}
	
	public void addFirst(Object e){
		if(isEmpty()){
			Node1 newNode=new Node1(e);
			head=newNode;
			
			//head=new Node1(e);	
		}
		
		else{
			
			Node1 newNode=new Node1(e,head);
			head=newNode;
			
		}
		
		size++;
	}
	
	public void addLast(Object e){
		
		if(isEmpty()){
			Node1 newNode=new Node1(e);
			head=newNode;
		}
		
		else{
			Node1 tmp=head;
			while(tmp.next!=null)
				tmp=tmp.next;
			
			Node1 newNode=new Node1(e);
			tmp.next=newNode;
		}
		
		size++;
	}
	
	public void insertBefore(Object e,Object before){
		
		if(isEmpty())
		{
			System.out.println("the list is empty");
		}
		
		else if(head.data==before){
			
			
			Node1 newNode=new Node1(e,head);
			head=newNode;
			
		}
		
	
		else{
			Node1 tmp=head;
			
			while(tmp.next!=null && tmp.next.data!=before)
			{
				tmp=tmp.next;
			}
			
			if(tmp.next==null)
				System.out.println("the element "+ before +" is not in the List");
			
			else{
				Node1 newNode=new Node1(e,tmp.next);
				tmp.next=newNode;
			}
			
		}
		
		size++;
		
	}
	
	public void remove(Object e){
		if(isEmpty())
			System.out.println("The list is empty");
		
		else{
			Node1 tmp=head;
			while(tmp.next!=null && tmp.next.data!=e)
			{
				tmp=tmp.next;
			}
			
			if(tmp.next==null)
				System.out.println("the element " +e +" is not in the list");
			
			else{
				
				tmp.next=tmp.next.next;
				
			}
			}
		
	}
	
	public void print(){
		if(isEmpty())
			System.out.print("The list is empty");
		
		else{
			Node1 tmp=head;
			while(tmp!=null){
				System.out.println(tmp.data);
				tmp=tmp.next;
				
			}
		}
	}
	
	public static void main(String args[])
	{
		SinLL s=new SinLL();
		
		/*s.addFirst("alex");
		s.addFirst("rox");
		s.addFirst("bob");
		s.addFirst("jen");*/
		
		s.addLast("jen");
		s.addLast("bob");
		s.addLast("rox");
		s.addLast("alex");
		
		s.insertBefore("Micky","bob");
		
		s.remove("Micky");
		//s.addFirst("Nicky");
		s.insertBefore("Nicky","jen");
		
		s.print();
		
	}
}