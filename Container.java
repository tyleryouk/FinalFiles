//Question 4

public class Container<T> {
 
    //T are primaryContainer and secondaryContainer
    T primaryContainer;
    T secondaryContainer;
    
    public Container<T>(T container1, T container2){
       primaryContainer = container1;
       secondaryContainer = container2;
    }
    
    /**Getter methods*/
    public T getPrimaryContainer(){return primaryContainer;}
    public T getSecondaryContainer(){return secondaryContainer;}
    /**Setter methods*/
    public void setPrimaryContainer(T inputP){ primaryContainer = inputP; }
    public void setSecondaryContainer(T inputS){ secondaryContainer = inputS; }
}