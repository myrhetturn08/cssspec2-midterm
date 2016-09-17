
package midterms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Midterms {
  
    public static void main(String[] args) throws FileNotFoundException {
      
        
        Scanner in = new Scanner(new FileReader("input.txt"));
        while(in.hasNext()){
            
            System.out.println(in.nextLine());
        
        
        
        }
        
        
        
        
        
        
    }
    
}
