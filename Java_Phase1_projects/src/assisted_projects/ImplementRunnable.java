package assisted_projects;

public class ImplementRunnable implements Runnable{
	public void run() {
		System.out.println("You are using Runnable Interface method");
	}
		
	
	public static void main(String[] args) {
		ImplementRunnable method2=new ImplementRunnable();
		Thread t=new Thread(method2);
		t.start();
	}

}