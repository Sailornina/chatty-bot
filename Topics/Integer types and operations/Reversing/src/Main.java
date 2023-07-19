import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstDigit = number % 10;
        int secondDigit = (number / 10) % 10;
        int threeDigit = number / 100;

        int reverse = ((firstDigit * 100) + (secondDigit * 10 ) + threeDigit);
        System.out.println(reverse);
    }
}