import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        var everNumber = ((number % 2) == 0) ? (number + 2) : (number + 1);

        System.out.println(everNumber);

    }
}