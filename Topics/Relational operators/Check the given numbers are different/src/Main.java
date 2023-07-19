import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        boolean differentOrSame = (numberOne != numberTwo) && (numberTwo != numberThree) && (numberThree != numberOne);

        System.out.println(differentOrSame);
}}