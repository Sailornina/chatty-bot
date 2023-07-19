import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();
//        int firstDigit = (int) (number / Math.pow(10, (int)Math.log(number)));

        int firstDigit = (int) Math.floor(number / 10);

        System.out.print(firstDigit);

    }
}