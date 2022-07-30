package assisted_projects;

public class ExtendThread extends Thread{
	public void run() {
		System.out.println(this.getId()+" My Thread");
		System.out.println("You are using Extend Thread method to create thread");
	}

	public static void main(String[] args) {
		ExtendThread method= new ExtendThread();
		method.setPriority(4);
		method.start();

	}

}
