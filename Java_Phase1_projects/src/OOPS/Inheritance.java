package OOPS;

class Person{
	String name="Savitha";
	int age=22;
	String city="Tamilnadu";
	void display() {
		System.out.println("Person class is a super class");
	}
	
}
public class Inheritance extends Person {
	
	String DOB="August 22";

	public static void main(String[] args) {
		
		Inheritance inher=new Inheritance();
		inher.display();
		
		System.out.println("Person Detail");
		System.out.println("Person Name : "+inher.name);
		System.out.println("Person Age : "+inher.age);
		System.out.println("Person City : "+inher.city );
		System.out.println("Person DOB : "+inher.DOB);

		
		
	}

}