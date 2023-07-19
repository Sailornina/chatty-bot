import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt();

        boolean isTrueOrFalse = (numberValue < 10) && (numberValue > 0);

        System.out.println(isTrueOrFalse);
    }
}