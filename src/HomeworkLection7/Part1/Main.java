package HomeworkLection7.Part1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Blue", 2020, 200, true);

        Car car2 = new Car("BWW", "Black", true);

        Car car3 = new Car("Ford", "Silver", 2019, 150);

        Car car4 = new Car("Nissan", 2018, 180, false);

        Car car5 = new Car();

        displayCarDetails(car1);
        displayCarDetails(car2);
        displayCarDetails(car3);
        displayCarDetails(car4);
        displayCarDetails(car5);
    }

    public static void displayCarDetails(Car car) {
        System.out.println("Car Details:");
        System.out.println("Name: " + car.getName());
        System.out.println("Color: " + car.getColor());
        System.out.println("Release Year: " + car.getReleaseYear());
        System.out.println("Horse Power: " + car.getHorsePower());
        System.out.println("Second Hand: " + car.isSecondHand());
        System.out.println();
    }
}
