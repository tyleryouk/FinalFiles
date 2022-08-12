//Question 5

public class DataContainer<Data> extends Container<Data> {
   
  public DataContainer<Data>(Data container1, Data container2){
       super(container1, container2);
  }
  
  
  //Can call it regularly, but we are going to override it anyways
  /**Getter methods*/
  public Data getPrimaryContainer(){return this.getPrimaryContainer;}
  public Data getSecondaryContainer(){return this.getSecondaryContainer;}
    /**Setter methods*/
  public void setPrimaryContainer(Data inputP){ this.setPrimaryContainer(inputP) }
  public void setSecondaryContainer(Data inputS){ this.setSecondaryContainer(inputS) }
  
  //Question 6
  public static void main(String[] args){
    //works if DataWriter is a subclass of Data
    DataContainer<DataWriter> writerTyler = new DataContainer<DataWriter>(new DataWriter() c, new DataWriter() c2);
    
  }
}