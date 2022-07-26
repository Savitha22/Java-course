package assisted_projects;

import java.util.*;

public class collectionAssisted {

	public static void main(String[] args) {
		System.out.println("Creating ArrayList");
		ArrayList<String> list=new ArrayList<String>();
		list.add("adbcd");//Adding object in array list 
		list.add("efghi");  
		list.add("jklmn");  
		list.add("opqrs");  
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		System.out.println("Creating Linked List");
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(123);
		list1.add(456);
		list1.add(789);
		Iterator<Integer> itr1=list1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Creating Stack");

		Stack<String> stack = new Stack<String>();  
		stack.push("Fruit");  
		stack.push("Apple");  
		stack.push("Mango");  
		stack.push("Orange");  
		stack.pop();  
		Iterator<String> itr3=stack.iterator();  
		while(itr3.hasNext()){  
		System.out.println(itr3.next());  
		
		System.out.println("Creating Vector");
		Vector<Integer> v=new Vector<Integer>();  
		v.add(101);  
		v.add(102);  
		v.add(103);  
		v.add(104);  
		Iterator<Integer> itr4=v.iterator();  
		while(itr4.hasNext()){  
		System.out.println(itr4.next());  
		}  
	}

}
}