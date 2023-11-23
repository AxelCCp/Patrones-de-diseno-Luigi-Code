package B5_Iterator_v2;

import java.util.Iterator;

/*import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;*/

public class TestIterator {
	
	public static void main(String[] args) {
		
		/*
		List<String> list = Arrays.asList("Hola", "como", "estas");
		Iterator<String>iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Esta es una pila
		Stack<String>stack = new Stack<>(); 
		stack.push("hola");
		stack.push("como");
		stack.push("estas");
		
		iterator = stack.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		*/
		
		//-------------------------------------------------------------------------------------
		
		ListNode<String>listNode = new ListNode<String>(new Node<>("hola"));
		listNode.addEnd("que");
		listNode.addEnd("tal");
		Iterator<Node<String>>iterator = listNode.iterator;
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
