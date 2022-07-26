package accessModifier;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class accessModifier2 {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		d.setName("java program");
        System.out.println(d.getName());
	}

}