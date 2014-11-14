import static org.junit.Assert.*;
import org.junit.Test;


public class NodeTest {
	
	@Test
	public void test1(){
		Person a = new Person("1",0);
		LLNode start = new LLNode(a);
		start = (LLNode) start.add(start);
		Node data = start.search(new Person("2",0));
		String person = data.getData().toString();
		assertEquals(0, a.compareTo(start));
		
	}
	
	@Test
	public void test2(){
		LLNode start = new LLNode(new Person("8", 0));
		start.add(new LLNode(new Person("5", 0)));
		start.add(new LLNode(new Person("10", 0)));
		start.add(new LLNode(new Person("1", 0)));
		start.add(new LLNode(new Person("12", 0)));
		start.add(new LLNode(new Person("13", 0)));
		Comparable i = start.getData();
		int n = i.compareTo(new Person("5",0));
		assertEquals(true, n == 8);
	}
	
	/*@Test
	public void test3(){
	LinkedList ll = new LinkedList();
		Node node = new LLNode();
		Person a = new Person("John", 0);
		LLNode start = new LLNode(a);
		
	}
	
	@Test 
	public void test4(){
	LinkedList ll = new LinkedList();
		Node node = new LLNode();
		Person a = new Person("John", 0);
		LLNode start = new LLNode(a);
		
	}
	
	@Test
	public void test5(){
	LinkedList ll = new LinkedList();
		Node node = new LLNode();
		Person a = new Person("John", 0);
		LLNode start = new LLNode(a);
		
	}
	
	@Test
	public void test6(){
	LinkedList ll = new LinkedList();
		Node node = new LLNode();
		Person a = new Person("John", 0);
		LLNode start = new LLNode(a);
		
	}
	
	@Test
	public void test7(){
	LinkedList ll = new LinkedList();
		Node node = new LLNode();
		Person a = new Person("John", 0);
		LLNode start = new LLNode(a);
		
	}
	
	@Test
	public void test8(){
	LinkedList ll = new LinkedList();
		Node node = new LLNode();
		Person a = new Person("John", 0);
		LLNode start = new LLNode(a);
		
	}
	
	@Test
	public void test9(){
	LinkedList ll = new LinkedList();
		Node node = new LLNode();
		Person a = new Person("John", 0);
		LLNode start = new LLNode(a);
		
	}
	
	@Test
	public void test10(){
	LinkedList ll = new LinkedList();
		Node node = new LLNode();
		Person a = new Person("John", 0);
		LLNode start = new LLNode(a);
	
	}*/
}
