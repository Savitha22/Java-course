package assisted_projects;

public class overloadMethod {
	
	public void area(int b,int h) {
         System.out.println("Area of Triangle : "+(0.5*b*h));
		}
    public void area(int r) {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[]){
    	overloadMethod ob=new overloadMethod();
        ob.area(25,15);
        ob.area(9);  
   }
}
