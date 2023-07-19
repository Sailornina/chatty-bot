import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String checkBurgs = scanner.nextLine();

        System.out.println(checkBurgs.endsWith("burg"));

    }
}