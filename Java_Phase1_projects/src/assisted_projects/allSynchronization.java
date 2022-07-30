package assisted_projects;

class Board{
	synchronized void printTable(int n) {
		for(int i=0;i<3;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
class MyThread1 extends Thread{
	Board t;
	MyThread1(Board t) {
		this.t = t;
	  }
	public void run() {
		t.printTable(5);
	}
}
class MyThread2 extends Thread{
	Board t;
	MyThread2(Board t) {
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
}


public class allSynchronization {
	public static void main(String[] args) {
		Board obj = new Board();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}
}
