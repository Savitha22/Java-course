package assisted_projects;


import java.io.IOException; 
import java.nio.file.*; 
  
public class deleteFile{
	
    public static void main(String[] args) throws Exception{ 
        try{ 
            Files.deleteIfExists(Paths.get("C:\\Users\\Savitha\\eclipse-workspace\\tedyghbcudyhcb.txt")); 
                System.out.println("Deletion successful."); 
              }
        catch(NoSuchFileException e){ 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e){ 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e){ 
            System.out.println("Invalid permissions."); 
        } 
          
    
    } 
}
