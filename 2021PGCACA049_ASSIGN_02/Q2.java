
Online Java - IDE, Code Editor, Compiler
Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;

public class Main
{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.println("ENTER RADIUS OF CIRCLE ::");
      int rad =s.nextInt();
   
      System.out.println("ENTER CORDINTAES X1,Y1::");
      int x1 = s.nextInt();
      int y1 = s.nextInt();
     
      double d1 = Math.sqrt((x1*x1) + (y1*y1));
      
      if(d1>rad)
      {
          System.out.println("POINT IS OUTSIDE THE CIRCLE!");
      }
      else if(d1<rad)
      {
          System.out.println("point is inside the circle");
      }
      else if(d1==rad)
      {
          System.out.println("point is on the circle!!");
      }
      else
      {
          System.out.println("INvalid input!!");
      }
      
      
    }
}

