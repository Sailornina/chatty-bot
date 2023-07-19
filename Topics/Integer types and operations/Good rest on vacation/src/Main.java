import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int oneNightHotel = scanner.nextInt();

        int totalHotelCost = oneNightHotel * (days - 1);
        int totalFlight = oneWayFlight * 2;
        int totalFood = days * foodPerDay;

        int totalCostHoliday = totalHotelCost + totalFood + totalFlight;

        System.out.println(totalCostHoliday);

    }
}