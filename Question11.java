//Question 11

import java.util.*;

public class Question11 {
  
  public static double average(double[][] inputArray) throws NoSuchElementException {
    
    if (inputArray.length == 0){
      throw new NoSuchElementException("No elements");
    }
    
    double sum=0;
    //giong through input array elements
    for(int i=0;i<inputArray.length;i++){
      for(int j=0;j<inputArray[0].length;j++){

        //accumulate the element entered into sum variable to find sum
        sum+=inputArray[i][j];
      }
    }
    
    return sum/(double)(inputArray.length*inputArray[0].length);
  }
  
  public static void main (String[] args){
    Question11 tester = new Question11();
    double[][] testArray = {};
    
    System.out.println(Question11.average(testArray));
  }
  
    
}