package assisted_projects;

public class QueueExample {

    static Node front, rear ;

	
	private class Node{
	    
		int data;       
	    Node next;    
		}
	
	public void dequeue(){
        if (isEmpty()) {
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }
 
        // advance front to the next node
        front = front.next;
 
        // if the list becomes empty
        if (front == null) {
            rear = null;
            System.out.println("There is no element after this");
        }
	}
	
	public void enqueue(int key){
        Node new_node = new Node();
        
        if (isEmpty()) {     
            front = new_node;
            rear = new_node;
        }
        else {
            // update rear
        	new_node.data=key;
            rear.next = new_node;
            rear = new_node;
        }
    }
 
   
    public static int peek() {
        // check for an empty queue
        if (isEmpty()) {
            System.exit(-1);
        }
 
        return front.data;
    }
    
    
    public void display(){
        
        if (isEmpty()) {
            System.out.println("\nQueue is empty");
           }
        else {
            Node temp =front;
            while (temp != null) {
                
                System.out.println( temp.data);
                
                temp = temp.next;
            }
        }
    }
    
    private static boolean isEmpty() {
		return front==null;
	}

	public static void main(String[] args)
    {
        QueueExample q = new QueueExample();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
 
        System.out.printf("The front element is %d\n", q.peek());
 
        q.dequeue();
        q.dequeue();
        q.display();
}
}