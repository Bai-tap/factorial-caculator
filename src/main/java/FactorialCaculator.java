import java.util.Scanner;

public class FactorialCaculator {
    public static void main(String[] args) {
        System.out.println("Factorial caculation program: ");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();

        long fact = factorial(number);
        System.out.println(fact);
    }

    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
