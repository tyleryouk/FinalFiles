//Question 8
import java.lang.Math.*;
public class SquareRoots {
  
  public void squareRoot(String[] args){
    for(String num: args){
    try{
      Double sqRoot = Double.parseDouble(num); //Convert input String to double
      if(sqRoot < 0){ 
      sqRoot = Math.abs(sqRoot);
      System.out.printf("%si\n", Math.sqrt(sqRoot));
      }
      else{
        System.out.printf("%s\n", Math.sqrt(sqRoot));
      }
    } catch(NumberFormatException e){
      System.out.println("Not a Number");
    }
    }
  }
  
  public static void main(String[] args){
    SquareRoots sq = new SquareRoots();
    sq.squareRoot(args);
    
  }
}