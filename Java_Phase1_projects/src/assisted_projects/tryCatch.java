package assisted_projects;

public class tryCatch {
	
	static void getInfo(){
		
		System.out.println(18/2);
		int arr[]={7};
		System.out.println(arr[2]);
		
	}
	public static void main(String[] args) {
	try{	
	getInfo();
	System.out.println("Main Try");
	}
	catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
		System.out.println("This is Try & Catch");
}

}


