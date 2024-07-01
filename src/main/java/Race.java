import java.util.ArrayList;

public class Race {
     String lead = "";
     int distanceLead = 0;
    ArrayList<Car> cars = new ArrayList<>();

    public void nowLead() {
        Car leader = cars.get(0);
        distanceLead = cars.get(0).speed * 24;
          for (Car car : cars) {
            int distance = car.speed * 24;
            if (distance > distanceLead) {
                distanceLead = distance;
                leader = car;
            }
          }

          lead = leader.name;
        System.out.println("Победилем гонки становится: " + lead);
        }
    }

