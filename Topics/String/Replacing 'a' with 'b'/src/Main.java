import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String replaceOneWord = scanner.next();

       System.out.println(replaceOneWord.replace("a", "b"));
    }
}