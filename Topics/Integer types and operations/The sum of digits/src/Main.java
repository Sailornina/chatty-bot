import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digits = scanner.nextInt();

        int firstDigit = digits / 100;
//        int secondDigit = (firstDigit % 100) / 10;
        int secondDigit = (digits / 10) % 10;
        int thirdDigit = digits % 10;

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;


        System.out.println(sumOfDigits);
    }
}