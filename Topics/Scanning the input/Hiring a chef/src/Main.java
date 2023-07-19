import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Eugene = scanner.nextLine();
        int num = scanner.nextInt();
        String fusion = scanner.next();

        System.out.println("The form for " + Eugene + " is completed. We will contact you if we need a chef who cooks " + fusion + " dishes and has " + num + " years of experience.");
    }
}