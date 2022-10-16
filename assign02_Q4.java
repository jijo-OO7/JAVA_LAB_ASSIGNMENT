import java.util.*;

class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();

        int[] array1 = new int[n];
        System.out.println("Enter the elements of the array 1 : ");
        for(int i=0;i<n;i++)
        {
            array1[i] = sc.nextInt();
        }

        int[] array2 = new int[n];
        System.out.println("Enter the elements of the array 2 : ");
        for(int i=0;i<n;i++)
        {
            array2[i] = sc.nextInt();
        }

        int[] sum = new int[n];

        for(int i=0;i<n;i++)
        {
            sum[i]  = array1[i] * array2[i];
        }

        System.out.println("DOT PRODUCT OF GIVEN VECTOR:: \n");
        for(int x : sum)
            System.out.print(x + " ");

    }
}
