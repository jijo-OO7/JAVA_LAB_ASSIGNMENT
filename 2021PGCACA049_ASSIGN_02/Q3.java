import java.util.*;
class GCD
{


 int gcdRec(int m,int n)
 {
     if(m==0)
         return n;
     else
         return gcdRec(n%m,m);

 }
 void gcdIt(int a,int b)
 {
     int gc = 1;
     for(int i = 1; i <=  a && i <= b; i++)
     {
         if(a%i == 0 && b%i == 0)
             gc = i;
     }
     System.out.println("GCD with iteration is : " + gc);
 }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCD g = new GCD();
        int g1 = g.gcdRec(a,b);
        System.out.println("GCD with recursion is : " + g1);
       g.gcdIt(a,b);

    }
}
