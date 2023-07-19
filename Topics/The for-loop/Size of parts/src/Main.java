import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int perfectSize = 0;
        int smallerSize = 0;
        int largerSize = 0;

        for (int i = 0; i < n; i++) {
            int detectorPrint = scanner.nextInt();
            if (detectorPrint == 0) {
                perfectSize++;
            } else if (detectorPrint == 1) {
                largerSize++;
            } else if (detectorPrint == -1) {
                smallerSize++;
            }
        }
        System.out.println(perfectSize + " " + largerSize + " " + smallerSize);
    }
}
