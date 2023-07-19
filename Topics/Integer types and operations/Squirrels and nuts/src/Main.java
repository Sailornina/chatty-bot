import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nutsK = scanner.nextInt();
        int squirrelsN = scanner.nextInt();

        int sumTotal = squirrelsN + nutsK;

        int substracNuts = sumTotal % nutsK;

        System.out.println(substracNuts);

    }
}