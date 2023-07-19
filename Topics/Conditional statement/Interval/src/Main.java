import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int interval = scanner.nextInt();

        if ((interval > -15 && interval <= 12) || (interval > 14 && interval < 17) || (interval >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}