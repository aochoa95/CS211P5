//Partners: Ethan Huey, Andreas Ochoa
public class LLNode implements Node{
	private Comparable data; 
	private Node next;
	private Node prev;
	
	public LLNode(Comparable data){
		this.data = data;
		next = null;
		prev = null;
	}

	public Node add(Node node){
		LLNode head = this;
		LLNode current = this;
		while (current.getNext() != null){
			if (current.getData().compareTo(node.getData()) < 0){
				LLNode prevprev = (LLNode)current.getPrev();
				current.setPrev(node);
				current.getPrev().setPrev(prevprev);
				current.getPrev().setNext(current);
				if (prevprev != null)
					prevprev.setNext(current.getPrev());
				if (head.getData().compareTo(node.getData()) < 0)
					head = current;
				return head;
			}
			current = (LLNode)current.getNext();
		}
		current.setNext(node);
		current.getNext().setPrev(current);
		return head;
	}
	
	public Node search(Comparable item){
		LLNode current = this;
		while (current.getNext() != null){
			if (item.compareTo(current.getData()) == 0){
				return (Node)current;
			}
			current = (LLNode)current.getNext();
		}
		return null;
	}

	public Comparable getData(){ return data; }
	public Node getNext(){ return next; }
	public Node getPrev(){ return prev; }
	public void setNext(Node next){ this.next = next; }
	public void setPrev(Node prev){ this.prev = prev; }
}
