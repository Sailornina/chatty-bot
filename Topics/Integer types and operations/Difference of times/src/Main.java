import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstHour = scanner.nextInt();
        int firstMinute = scanner.nextInt();
        int firstSecond = scanner.nextInt();

        int secondHour = scanner.nextInt();
        int secondMinute = scanner.nextInt();
        int secondSecond = scanner.nextInt();

        int firstTimeSeconds = firstHour * 3600 + firstMinute * 60 + firstSecond;
        int secondTimeSeconds = secondHour * 3600 + secondMinute * 60 + secondSecond;

        int differenceSeconds = secondTimeSeconds - firstTimeSeconds;

        System.out.println(differenceSeconds);
    }
}