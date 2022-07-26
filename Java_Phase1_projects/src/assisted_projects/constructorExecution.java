package assisted_projects;
//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n){
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" is the student_id and name is- "+name);
	}
}

public class constructorExecution {
	public static void main(String[] args) {

		Std std1=new Std(2,"Savitha");
		Std std2=new Std(10,"kumar");
		std1.display();
		std2.display();
		}
}

