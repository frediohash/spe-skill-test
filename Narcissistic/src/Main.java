import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner narc = new Scanner(System.in);
        System.out.println("Enter a number");
        int answer = narc.nextInt();
        isNarcissisticNumber(answer);
    }

    public static boolean isNarcissisticNumber(int number) {
        int input = number;
        int count = 0;
        int total = 0;
        boolean verify;
        if (count>3){
            System.out.println("That is not a 3 digit number");
        }
        else {
            while (count <= 3) {
                int digit = input % 10;
                total += (digit * digit * digit);
                count++;
                input /= 10;
            }
        }
        if (total == number) {
            verify = true;
            System.out.println("True");
        }
        else {
            verify = false;
            System.out.println("False");
        }

        return verify;
    }
}