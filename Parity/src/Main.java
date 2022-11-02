import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner narc = new Scanner(System.in);
        System.out.println("Enter a number");
        int[] pars = new int[3];
        for (int par : pars) {
            par = narc.nextInt();
        }
        findOutLierIndex(pars);
    }

    public static int findOutLierIndex(int[] input) {
        int result = -1;

        if (input != null && input.length > 2) {

            for (int i = 2; i < input.length; i++) {
                if (isEven(input[i]))
                    if ( isOdd(input[i - 1]) && isOdd(input[i - 2]))
                        return i;
                if ( isEven(input[i - 1]) && isOdd(input[i - 2] ))
                    return i - 2;
                else if ( isOdd(input[i - 1]) && isEven(input[i - 2]))
                    return i - 1;
                if (isOdd(input[i]))
                    if (isEven(input[i - 1]) && isEven(input[i - 2]))
                        return i;
                if (isOdd(input[i - 1]) && isEven(input[i - 2]))
                    return i - 2;
                else if (isEven(input[i - 1]) && isOdd(input[i - 2]))
                    return i - 1;
            }
        }

        return result;
    }

    public static boolean isEven(int number){
        return (number % 2 == 0);
    }
    public static boolean isOdd(int number){
        return (number % 2 == 1);
    }
}