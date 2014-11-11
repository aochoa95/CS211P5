public class LLNode implements Node{
	private Comparable<Person> data; 
	private Node next;
	private Node prev;
//	private Node head;
	
	public LLNode(Comparable<Person> data){
		this.data = data; 
		next = null;
	}
	
	public Node add(Node node){
		//TODO sort
		return this;
	}
	
	public Node search(Comparable item){
		Node current = this;
		while (current.next != null){
			if (item.compareTo(current.getData()) == 0)
				return current;
			current = current.next;
		}
		return null;
		//TODO fix
	}

	public Comparable<Person> getData(){ 
		return data;
		//TODO return head
	}
	
	public Node getNext(){ return next; }
	public void setNext(Node next){ this.next = next; }
	public void setPrev(Node prev){ this.prev = prev; }
}
