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
			if (node.getData().compareTo(current.getData()) > 0){
				LLNode prevprev = (LLNode)current.getPrev();
				current.setPrev(node);
				current.getPrev().setPrev(prevprev);
				current.getPrev().setNext(current);
				if (head.getData().compareTo(current.getData()) < 0)
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
		System.out.println(item);
		while (current.getNext() != null){
			if (item.compareTo(current.getData()) == 0){
				System.out.println("pls");
				return (Node)current;
		    }
			current = (LLNode)current.getNext();
			System.out.println(current.getData()+ "    " + item.compareTo(current.getData()));
		}
		return null;
	}

	public Comparable getData(){ return data; }
	public Node getNext(){ return next; }
	public Node getPrev(){ return prev; }
	public void setNext(Node next){ this.next = next; }
	public void setPrev(Node prev){ this.prev = prev; }
}
