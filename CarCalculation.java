import java.util.Scanner;

public class CarCalculation {
    private String brand;
    private String model;
    private double price;

    public CarCalculation(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static double calculateAverage(CarCalculation car1, CarCalculation car2, CarCalculation car3) {
        double average = (car1.price + car2.price + car3.price) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for car 1:");
        System.out.println("Enter Car Brand: ");
        String brand1 = scanner.nextLine();
        System.out.println("Enter Car Model: ");
        String model1 = scanner.nextLine();
        System.out.println("Enter Car Price: ");
        double price1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter details for car 2:");
        System.out.println("Enter Car Brand: ");
        String brand2 = scanner.nextLine();
        System.out.println("Enter Car Model: ");
        String model2 = scanner.nextLine();
        System.out.println("Enter Car Price: ");
        double price2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter details for car 3:");
        System.out.println("Enter Car Brand: ");
        String brand3 = scanner.nextLine();
        System.out.println("Enter Car Model: ");
        String model3 = scanner.nextLine();
        System.out.println("Enter Car Price: ");
        double price3 = Double.parseDouble(scanner.nextLine());

        CarCalculation c1 = new CarCalculation(brand1, model1, price1);
        CarCalculation c2 = new CarCalculation(brand2, model2, price2);
        CarCalculation c3 = new CarCalculation(brand3, model3, price3);

        double avgPrice = calculateAverage(c1, c2, c3);
        System.out.println("The average price of the three cars is: " + avgPrice);
    }
}