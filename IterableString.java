//Question 9

import java.util.Iterator;

class IterableString implements Iterable<Character> {

  private String string;

  public IterableString(String string) {
    this.string = string;
  }
  
  @Override
  public Iterator<Character> iterator() {
    return new Iterator<Character>(){
      int i = 0;
      
      @Override
      public boolean hasNext() {
        return i < string.length();
      }
      
      @Override
      public Character next() {
        return string.charAt(i++);
      }
      @Override 
      public void remove(){
          
      }
    };
  }
  
  public static void main(String[] args) {
        IterableString iterableString = new IterableString("Hello");

        for (Character character : iterableString) {
            System.out.print(character);
        }

    }
}