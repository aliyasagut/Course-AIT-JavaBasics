package running;

public class ExercisedPerson extends Person{
    private int speed = 15;


    @Override
    public void run() {
        System.out.println("I just like exercises and can run " + speed + " km/h");
    }
}
