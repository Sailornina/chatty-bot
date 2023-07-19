import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nutsK = scanner.nextInt();

        int squirrelsN = scanner.nextInt();

        int divideTotal = squirrelsN / nutsK;

        System.out.println(divideTotal);
    }
}