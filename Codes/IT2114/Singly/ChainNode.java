class ChainNode
{
	ChainNode next;
	Object data;
ChainNode( )
	{
		
	}
ChainNode(Object x)
{
	this.data=x;
	this.next=null;
}
ChainNode(Object x,ChainNode next)
{
	this.data=x;
	this.next=next;
}
}
