import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ": ");
            Car.car = scanner.next();

            Car.speed = 0;
            while (true) {
                System.out.println("Введите скорость машины №" + i + ": ");
                Car.speed = scanner.nextInt();
                if ((Car.speed >= 0) & (Car.speed <= 250)) {
                    break;
                } else {
                    System.out.println("Введите скорость от 0 до 250.");
                }
            }
                Car car = new Car(Car.car, Car.speed);
                Race.nowLead(car);

        }


        System.out.println("Победилем гонки становится: " + Race.lead);
        scanner.close();
    }
}
