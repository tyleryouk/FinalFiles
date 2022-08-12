//Question 3
  public class Gear extends Part {
    
    double diameter;
    int numTeeth;
    public Gear(Manufacturer m, String p, double pr, double d, int n){
      super(m,p,pr);
      diameter = d;
      numTeeth = n;
    }
    public Gear(Manufacturer m, String p, double d, int n){
      super(m,p);
      diameter = d;
      numTeeth = n;
    }
    
    /**Getter methods*/
    public double getDiameter(){ return diameter; }
    public int getNumTeeth(){ return numTeeth; }
    
    @Override
    public void setPrice(double pInput){ this.price = pInput;}
    
  }