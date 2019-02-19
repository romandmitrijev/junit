package assertation;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    public static int calculateFactorial(int number) {
        if (number<=0)
            throw new RuntimeException("The number must be more than 0");

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
