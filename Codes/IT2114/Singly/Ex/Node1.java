class Node1{
	
	Object data;
	Node1 next;
	
	Node1(){}
	
	Node1(Object e){
		this.data=e;
		this.next=null;
	}
	
	Node1(Object e,Node1 next)
	{
		this.data=e;
		this.next=next;
	}
	
	
}