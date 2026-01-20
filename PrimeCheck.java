import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}


import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        int lcm = calculateLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Function to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the LCM using the relationship: LCM(a, b) = (|a * b|) / GCD(a, b)
    public static int calculateLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        // Use long to prevent potential overflow when multiplying a and b
        long gcd = calculateGCD(Math.abs(a), Math.abs(b));
        long lcm = (long) Math.abs(a * b) / gcd;
        return (int) lcm;
    }
}
