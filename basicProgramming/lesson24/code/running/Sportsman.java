package running;

public class Sportsman extends Person {
    private int speed = 25;


    @Override
    public void run() {
        System.out.println("I am a sportsman and can run " + speed + " km/h");
    }
}
