package assisted_projects;

public class throwKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=35,b=0,rs;
		System.out.println("Our program using Throw keyword in Exception");
		try {
			if(b==0) {
			throw (new ArithmeticException("5 Can't divided by zero"));}
			else
			{
			 rs=a/b;
			System.out.println("Result is "+rs);}
		}
		catch(ArithmeticException e){
			System.out.println("Error :"+e.getMessage());
			
		}
        System.out.println("We are in out end of program");
	}

}
