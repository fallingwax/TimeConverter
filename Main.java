import java.util.*; 
import java.io.*;

class Main {  
  public static String TimeConvert(int num) { 
  
    Integer hours = (num / 60);
    Integer minutes = (num % 60);
    String returnNum = Integer.toString(hours)+':'+Integer.toString(minutes);
    
    return returnNum;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }   
  
}
