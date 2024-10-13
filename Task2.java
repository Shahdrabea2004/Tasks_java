import java.util.Scanner;

public class Task2 {
    static Scanner input = new Scanner(System.in);

    public static void First_Code_A() {
        long n = input.nextLong();
        for (int i = 1; i <= n; i++)
            System.out.println(i);
    }

    public static void Second_Code_E() {
        int n = input.nextInt();
        long Max[] = new long[n];

        for (int i = 0; i < n; i++) {
            Max[i] = input.nextLong();
        }

        long temp = Max[0];
        for (int i = 0; i < n; i++) {
            if (temp < Max[i]) {
                temp = Max[i];
            }
        }
        System.out.println(temp);

    }

    public static void Third_Code_c() {
        int n = input.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLong();
        }

        long Even = 0, Odd = 0, Positive = 0, negative = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                Even++;
            else if (arr[i] % 2 != 0)
                Odd++;
            if (arr[i] > 0)
                Positive++;
            else if (arr[i] < 0)
                negative++;
        }
        System.out.println("Even: " + Even);
        System.out.println("Odd: " + Odd);
        System.out.println("Positive: " + Positive);
        System.out.println("Negative: " + negative);

    }

    public static void Fourth_Code_B() {
        long n = input.nextLong();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void Fiveth_Code_Z() {
        long k = input.nextLong();
        long s = input.nextLong();
        long c=0;
        for (int i = 0; i <= k; i++)
        {
            for (int j = 0; j <= k; j++) {
                long z=s-i-j;
                if(z>=0&&z<=k)
                c++;

            }
        }
        System.out.println(c);

    }

    public static void main(String[] args) {
        // First_Code_A();
        // Second_Code_E();
        // Third_Code_c();
        // Fourth_Code_B();
        //Fiveth_Code_Z();
    }

}