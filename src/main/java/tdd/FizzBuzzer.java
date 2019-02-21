package tdd;

public class FizzBuzzer {

    public static String getValue(int input) {
        String result = "";
        if (input % 3 == 0)
            result += "Fizz";
        if (input % 5 == 0)
            result += "Buzz";
        if (input % 5 != 0 || input % 3 != 0)
            result += Integer.toString(input);
        return result;
    }
}
