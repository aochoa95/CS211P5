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
		LLNode head = this;
		LLNode current = this;
		while (current.getNext() != null){
			if (node.getData().compareTo(current.getData()) < 0){
				LLNode prevprev = current.getPrev();
				current.setPrev(node);
				current.getPrev().setPrev(prevprev);
				current.getPrev().setNext(current);
			}
		}
		node.getData()
		//TODO make it make sense; this code is jank dun use it
		return head;
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
