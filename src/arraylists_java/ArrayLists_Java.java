
package arraylists_java;
import java.util.*;
public class ArrayLists_Java {
    public static void main(String[] args) {
    //arraylist has additional functionality
   Scanner reader = new Scanner(System.in);
   ArrayList<String> memory = new ArrayList<String>();
        while (true) 
        { 
          memory.add(reader.nextLine());
          System.out.println(memory.toString());
        } 
    }    
}
