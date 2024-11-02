import java.util.Scanner;
import java.util.Arrays;
public class Task4 {

    static Scanner input = new Scanner(System.in);

    // Problem 1

    static public boolean Problem1_IsOdd(int n) {
        return (n % 2 == 0) ? false : true;
    }

    static public boolean Problem1_IsPalindrom(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int rn = n % 2;
            binary.append(rn);
            n /= 2;
        }

        return binary.toString().equals(binary.reverse().toString());
    }

    static public void Problem1_result() {
        int n = input.nextInt();
        if (Problem1_IsOdd(n) && Problem1_IsPalindrom(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Problem 2

    static public int Problem2_Min(int arr[], int n) {
        int mi = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < mi) {
                mi = arr[i];
            }
        }
        return mi;
    }

    static public int Problem2_Max(int arr[], int n) {
        int ma = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > ma) {
                ma = arr[i];
            }
        }
        return ma;
    }

    static public void Problem2_result() {
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print(Problem2_Min(arr, n) + " " + Problem2_Max(arr, n));

    }

    // Problem 3

    static public double Problem3_Average(double arr[], int n) {

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (sum / n);

    }

    static public void Problem3_result() {
        int n = input.nextInt();
        double arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextDouble();
        }

        System.out.printf("%.7f%n", Problem3_Average(arr, n));

    }


    // Problem 4

    static public long Problem4_DistinctNumbers(long arr[], int n) {

       long counter=n;
       Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if(arr[i]==arr[i-1])
            {
                counter--;
            }
        }
        return counter;

    }

    
    static public void Problem4_result() {
        int n = input.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLong();
        }

        System.out.println(Problem4_DistinctNumbers(arr,n));

    }


    public static void main(String[] args) {

        // Problem1_result();
        // Problem2_result();
        //Problem3_result();
        Problem4_result();

    }

    

}