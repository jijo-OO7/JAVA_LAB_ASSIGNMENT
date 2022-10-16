import java.util.Scanner;

public class Q5
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input! n should be greater than 0.");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //Sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.println("Number|Frequency");

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            count++;
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + "|" + count);
                count = 0;
            }
        }


        count++;
        System.out.println(arr[n - 1] + "\t" + count);
    }
}