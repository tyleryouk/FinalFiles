public class Question12{       
  
  public static Function<Integer, Double> summationFunction(){       
    
    Function<Integer, Double> functionRun = new Function<Integer, Double>() {
      //int number = num;         
      @Override         
      public Double apply(Integer num){             
        int number = num;             
        int ans = (number)*(number+1);           
        return Double.valueOf(ans/2);         
      }       
    };
    return functionRun;     
  }
  
  
   public static void main(String[] args){       
     System.out.println(Question12.summationFunction().apply(5));     
   } 
}
