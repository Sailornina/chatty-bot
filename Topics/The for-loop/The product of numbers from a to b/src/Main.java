import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = 2;
//        int b = 5;
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long result = a;


        for (long i = a + 1; i < b; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}