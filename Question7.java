/**
  * Takes a String value and returns a String that containes no vowels.
  * @param a String value to remove the vowels from 
  * @return the String that contains no vowels from the input String  
  */

public class Question7 {
  /**
  public String noVowels(String original){
    
    /**
     //building new StringBuilder of same chars as original
    StringBuilder sOriginal = new StringBuilder(original);
    StringBuilder sFinal = new StringBuilder("");
    //sOriginal = sOriginal.replace("a", "");
    
    for(int i = 0; i < sOriginal.length()-1; i++){ //going through all chars of original
      if(sOriginal.charAt(i).equals("a") || sOriginal.charAt(i).equals("e") ||
         sOriginal.charAt(i) == (char)"i" || sOriginal.charAt(i) == (char)"o" ||
         sOriginal.charAt(i) == (char)"u" || sOriginal.charAt(i) == (char)"A" || 
         sOriginal.charAt(i) == (char)"E" || sOriginal.charAt(i) == (char)"I" || 
         sOriginal.charAt(i) == (char)"O" || sOriginal.charAt(i) == (char)"U"){ 
         continue; //if character is a vowel, continue
      }  else {
        sFinal.append(sOriginal.charAt(i)); //if not, add character to sFinal
      } 
    }
    
    return sFinal.toString();
  }
  }*/
  
  public String noVowels(String original){
    return original.replaceAll("[AEIOUaeiou]",""); 
  }
  
  //Testing
  public static void main(String[] args){
    Question7 tt = new Question7();
    System.out.println(tt.noVowels("Army Valid"));
    
  }
}