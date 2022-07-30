package assisted_projects;

interface Car{
	public default void color() {
		System.out.println("Car color is : red");
	}
}
interface SportCar {
	public default void color() { 
	System.out.println("Sport car: Black");
	}
}
public class diamondProblem implements Car,SportCar {
    public void color() {
    	Car.super.color();
    	SportCar.super.color();
    }
	public static void main(String[] args) {
		diamondProblem diamond=new diamondProblem();
		diamond.color();
	}

}

