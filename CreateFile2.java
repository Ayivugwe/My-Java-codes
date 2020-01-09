import java.io.File; 
import java.io.IOException;
  
public class CreateFileDir {  
  public static void main(String[] args) {  
    try {  
      File myObj = new File("C:\\Users\\MyName\\filename.txt");  
      if (myObj.createNewFile()) {  
        System.out.println("File created: " + myObj.getName());  
        System.out.println("Absolute path: " + myObj.getAbsolutePath());  
      } else {  
        System.out.println("File already exists.");  
      }  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();  
    }  
  }  
} 
