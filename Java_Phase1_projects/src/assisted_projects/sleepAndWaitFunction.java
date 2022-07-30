package assisted_projects;

public class sleepAndWaitFunction  {
	
	private static Object object=new Object();
	
	public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (object) 
        {
            object.wait(1000);
            System.out.println("Object '" + object + "' is woken after" + " waiting for 1 second");
        }
    }
}


