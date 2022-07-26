package assisted_projects;

//anonymous inner class
abstract class anomousclass {
	   public abstract void display();
	}


	public class anonymousInnerClass {

	public static void main(String[] args) {
		anomousclass  i = new anomousclass () {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}
