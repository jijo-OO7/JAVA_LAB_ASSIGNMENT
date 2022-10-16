
//Q1
/*
Online Java - IDE, Code Editor, Compiler
Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //cordinates of first line 
        System.out.println("ENTER  VALUE OF X1 ,Y1::");
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        System.out.println("ENTER VALUE OF X2,Y2::");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
      
        int m1 =(y2-y1)/(x2-x1);
        
    
        //cordinates of 2nd line 
        System.out.println("ENTER VALUE OF X1',Y1'::");
        int x3= s.nextInt();
        int y3= s.nextInt();
        System.out.println("ENTER VALUE OF X2',Y2'");
        int x4 =s.nextInt();
        int y4 = s.nextInt();
        
        
       int m2 =(y4 - y3)/(x4 - x3);// slope of line 2
        
    
        if(m1 == m2)
        {
            System.out.println("LINES ARE PARALLEL");
        }
        else 
        {
            System.out.println("Lines are intersecting!!");
        }
      
      
    }
}

