package accessModifier;

class defAccessModifier {
	
    void message(){
        System.out.println("This is a message");
    }
}

    public class accessModifier1{
    	public static void main(String[] arg) {
    		// default
    		System.out.println("Default Access Modifier");
    		defAccessModifier obj= new defAccessModifier();
    	obj.message();
    		
    	}

    }
