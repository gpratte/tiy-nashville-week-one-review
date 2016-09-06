import java.util.Scanner;

/**
 * Created by gilpratte on 9/5/16.
 */
public class Fibonacci {

    public static long recursive(long n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return recursive(n - 1) + recursive(n - 2);
    }

    public static long loop(long n) {
        long first = 0, second = 1, next = 0;
        for (long i = 0; i <= n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
        }
        return next;
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sequence length: ");
        int length = scanner.nextInt();
        System.out.println("Recursive result " + recursive(length));
        System.out.println("Loop result " + loop(length));
    }
}
