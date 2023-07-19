import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupOneStudents = scanner.nextInt();
        int groupTwoStudents = scanner.nextInt();
        int groupThreeStudents = scanner.nextInt();

        int totalDesks = calculateDesks(groupOneStudents) + calculateDesks(groupTwoStudents) + calculateDesks(groupThreeStudents);

        System.out.println(totalDesks);
    }
        public static int calculateDesks(int students) {
            return (int) Math.ceil(students / 2.0);
        }
}