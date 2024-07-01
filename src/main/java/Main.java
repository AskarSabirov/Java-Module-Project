import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ": ");
            String name = scanner.next();
            int speed;

            while (true) {
                System.out.println("Введите скорость машины №" + i + ": ");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Введите скорость от 0 до 250.");
                    }
                } else {
                    System.out.println("Вы ввели не целое число. Повторите ввод.");
                    scanner.next(); // очистить некорректный ввод
                }
            }

            Car car = new Car(name, speed);
            race.cars.add(car);
        }
            race.nowLead();
            scanner.close();


    }
}
