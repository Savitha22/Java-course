package practise.projects2;

import java.util.ArrayList;
import java.util.Scanner;

public class emailValidation {

    public static void main(String[] args) {
        
    	Scanner sc=new Scanner(System.in);
        ArrayList<String> email = new ArrayList<String>();
        
        email .add("savithasinik@gmail.com");
        email.add("kalvi@yahoo.com");
        email.add("sakthi@wipro.com");
        email.add("sowmiya22@lit.com");
        email.add("abirr@mnb.com");
        email.add("adc@esco.com");
        email.add("Varsha.23@savi.com");
        email.add("sndjsg@jkshfu.com");
        
        String searchEmail = null;
        System.out.println("Enter the email to search");
        
        try (sc) {
			System.out.println("Enter email Id : ");
            searchEmail = sc.nextLine(); 
		}
            if(email.contains(searchEmail)){
            	System.out.println("email ID " + searchEmail + " found");
     }
     else{
         System.out.println( "email ID " + searchEmail + " not found");
     }

       
   }

}