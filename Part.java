import java.util.*;


//Question 1
public class Part extends Object{
  Manufacturer manufacturer;
  String partNumber;
  double price;
  
  public Part(Manufacturer m, String p, double pr){
    manufacturer = m;
    partNumber = p;
    price = pr;
  }
  public Part(Manufacturer m, String p){
    manufacturer = m;
    partNumber = p;
  }
  
  /**Getter methods*/
  public Manufacturer getManufacturer(){ return manufacturer; }
  public String getPartNumber(){ return partNumber; }
  public double getPrice(){ return price; }
  /**Getter methods*/
  public void setManufacturer(Manufacturer mInput){ manufacturer = mInput; }
  public void setPrice(double pInput){ price = pInput;}
  
  //Question 2
  @Override
  //same Manufacturer and Part Number
  public boolean equals(Part second){
    //checking manufacturer
    return (this.getManufacturer().equals(second.getManufacturer()) && this.getPartNumber().equals(second.getPartNumber()));
  }
  
  
}



