public class LLNode implements Node{
	private Comparable<Person> data; 
	private Node next;
	private Node prev;
//	private Node head;
	
	public LLNode(Comparable<Person> data){
		this.data = data;
		next = null;
		prev = null;
	}

	public Node add(Node node){
		LLNode current = this;
		while (current.getNext() != null){
			if (node.getData().compareTo(current.getData) < 1){
				next = new LLNode(node.getData());
				next.setPrev(this);
			}
		}
		node.getData()
		//TODO make it make sense
		//TODO sort
		//TODO return head
		return this;
	}
	
	public Node search(Comparable item){
		LLNode current = this;
		while (current.getNext() != null){
			if (item.compareTo(current.getData()) == 0)
				return (Node)current;
			current = (LLNode)current.getNext();
		}
		return null;
	}

	public Comparable<Person> getData(){ return data; }
	public Node getNext(){ return next; }
	public Node getPrev(){ return prev; }
	public void setNext(Node next){ this.next = next; }
	public void setPrev(Node prev){ this.prev = prev; }
}
