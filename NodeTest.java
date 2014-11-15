import static org.junit.Assert.*;
import org.junit.Test;


public class NodeTest {
	
	@Test
	public void test1(){
		Person a = new Person("1",0);
		LLNode start = new LLNode(a);
		start = (LLNode) start.add(start);
		//Node data = start.search(new Person("2",0));
		//String person = data.getData().toString();
		assertEquals(0, a.compareTo(a));
		
	}
	
	@Test
	public void test2(){
		LLNode start = new LLNode(new Person("1", 0));
		start = (LLNode) start.add(new LLNode(new Person("5", 0)));
		start = (LLNode) start.add(new LLNode(new Person("10", 0)));
		start = (LLNode) start.add(new LLNode(new Person("8", 0)));
		start = (LLNode) start.add(new LLNode(new Person("12", 0)));
		start = (LLNode) start.add(new LLNode(new Person("13", 0)));
		Comparable i = start.getData();
		int n = i.compareTo(new Person("8",0));
		assertEquals(true, n == 0);
	}
	
	@Test
	public void test3(){
		LLNode start = new LLNode(new Person("8", 0));
		start = (LLNode) start.add(new LLNode(new Person("5", 0)));
		start = (LLNode) start.add(new LLNode(new Person("10", 0)));
		start = (LLNode) start.add(new LLNode(new Person("7", 0)));
		start = (LLNode) start.add(new LLNode(new Person("12", 0)));
		start = (LLNode) start.add(new LLNode(new Person("14", 0)));
		start = (LLNode) start.add(new LLNode(new Person("1", 0)));
		start = (LLNode) start.add(new LLNode(new Person("9", 0)));
		start = (LLNode) start.add(new LLNode(new Person("3", 0)));
		start = (LLNode) start.add(new LLNode(new Person("19", 0)));
		start = (LLNode) start.add(new LLNode(new Person("11", 0)));
		start = (LLNode) start.add(new LLNode(new Person("15", 0)));
		start = (LLNode) start.add(new LLNode(new Person("6", 0)));
		Comparable i = new Person("5", 0);
		assertEquals(i, start.search(i).getData() );
	}
	
	@Test 
	public void test4(){
		LLNode start = new LLNode(new Person("1", 0));
		start = (LLNode) start.add(new LLNode(new Person("5", 0)));
		start = (LLNode) start.add(new LLNode(new Person("10", 0)));
		start = (LLNode) start.add(new LLNode(new Person("8", 0)));
		start = (LLNode) start.add(new LLNode(new Person("12", 0)));
		start = (LLNode) start.add(new LLNode(new Person("13", 0)));
		Comparable i = new Person("14", 0);
		assertEquals(null,start.search(i));
			
	}
	@Test
	public void test5(){
		LLNode start = new LLNode(new Person("8", 0));
		start = (LLNode) start.add(new LLNode(new Person("5", 0)));
		start = (LLNode) start.add(new LLNode(new Person("10", 0)));
		start = (LLNode) start.add(new LLNode(new Person("7", 0)));
		start = (LLNode) start.add(new LLNode(new Person("12", 0)));
		start = (LLNode) start.add(new LLNode(new Person("14", 0)));
		start = (LLNode) start.add(new LLNode(new Person("1", 0)));
		start = (LLNode) start.add(new LLNode(new Person("9", 0)));
		start = (LLNode) start.add(new LLNode(new Person("3", 0)));
		start = (LLNode) start.add(new LLNode(new Person("19", 0)));
		start = (LLNode) start.add(new LLNode(new Person("11", 0)));
		start = (LLNode) start.add(new LLNode(new Person("15", 0)));
		start = (LLNode) start.add(new LLNode(new Person("6", 0)));
		LLNode current = start;
		while (current != null ) {
		    System.out.println(current.getData());
		    current = (LLNode) current.getNext();
		}
		Comparable i = start.getData();
		//System.out.println(start.getData());
		int n = i.compareTo(new Person("9",0));
		//System.out.println(n);
		assertEquals(true, n == 0);
	}
	
	@Test
	public void test6(){
		LLNode start = new LLNode(new Person("1", 0));
		start = (LLNode) start.add(new LLNode(new Person("5", 0)));
		start = (LLNode) start.add(new LLNode(new Person("10", 0)));
		start = (LLNode) start.add(new LLNode(new Person("8", 0)));
		start = (LLNode) start.add(new LLNode(new Person("12", 0)));
		start = (LLNode) start.add(new LLNode(new Person("13", 0)));
		Comparable i = start.getData();
		int n = i.compareTo(new Person("8",0));
		assertEquals(true, n == 0);
		
	}
}
