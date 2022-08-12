//Question 10

import java.util.Iterator;

public class Question10{

  
  public String capitalize(IterableString unCap){
    
    StringBuilder noCap = new StringBuilder("");
    
    for(Character letter : unCap){
      if(Character.isLowerCase(letter)){
         noCap.append(Character.toUpperCase(letter));
      } else {
        noCap.append(letter);
      }
    }
    
    return noCap.toString();
  }
  
  
  public static void main(String[] args) {
        Question10 testString = new Question10();
        IterableString nonCapString = new IterableString("Hello");

        System.out.println(testString.capitalize(nonCapString));

    }

}