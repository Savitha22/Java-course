package assisted_projects;



public class throwsKeyword {
	static void getInfo() throws ArithmeticException, ArrayIndexOutOfBoundsException{
		System.out.println(5/3);
		int arr[]={7};
		System.out.println(arr[2]);
		
	}
	public static void main(String[] args) {
		
	try{	
		getInfo();
		System.out.println("Main Try");
	}
	catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
	}
		System.out.println("Hello All!!!");
}


}
