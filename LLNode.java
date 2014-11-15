//Project 5 by Andreas Aochoa and Ethan Huey

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
		while (current != null){ 
			if (current.getData().compareTo(node.getData()) < 0){
				LLNode prevprev = (LLNode)current.getPrev();
				current.setPrev(node);
				current.getPrev().setPrev(prevprev);
				current.getPrev().setNext(current);
				if (prevprev != null)
					prevprev.setNext(current.getPrev());
				if (head.getData().compareTo(node.getData()) < 0)
					head = (LLNode)node;
				return head;
			}
			if (current.getNext() != null)
				current = (LLNode)current.getNext();
			else break;
		}
		current.setNext(node);
		current.getNext().setPrev(current);
		return head;
	}
	
	public Node search(Comparable item){
		LLNode current = this;
		while (current != null){
			if (item.compareTo(current.getData()) == 0)
				return (Node)current;
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


/*

Questions 
1. While LinkedLists merely have to add a few new references, ArrayLists
   must copy entire sections of the array in order to create a new spot in the
   middle. 

2. The sorted array is going through a basic, slow, linear search. However the
   LinkedLists do not need to shift ~500 pieces of data to make space.

3. No, the numbers are different because of the entropy of the numbers. 

*/
