public class Race {
    static String lead = "";
    static int distanceLead = 0;


    public static void nowLead(Car car) {
        int distance = Car.speed * 24;
        if (distance > distanceLead ) {
            distanceLead = distance;
            lead = Car.car;

        }
    }
}
