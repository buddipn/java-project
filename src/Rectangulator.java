public class Rectangulator{
  public static void main (String[] args){
    int length = Interger.parseInt(args[0]);
    int width = Interger.parseInt(args[1]);

    Reactangle myRectangle = new Reactangle(length, width);

    String output = String.format("***** Your Reactangle *****\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());


    System.out.println(output);
  }
}
