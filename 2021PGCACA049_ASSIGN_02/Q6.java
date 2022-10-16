import java.util.*;

public class Main
{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
       System.out.println("ENTER NUMBER OF TERMS::");
        int n = s.nextInt();
       System.out.println("ENTR Initial value of a ::");
       int  a = s.nextInt();
       System.out.println("ENTER COMMON RATIO  r::");
       int r = s.nextInt();
       System.out.println("********GP SERIES****");
       for(int i = 0; i < n ; i++)
       {
          int value = a*r;
           System.out.println(value+" ");
           a = value;
           
       }
    }
}