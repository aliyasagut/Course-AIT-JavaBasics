package running;

public class MainRun {
    public static void main(String[] args) {


        Sportsman sportsman = new Sportsman();
        ExercisedPerson exercisedPerson = new ExercisedPerson();
        Person person = new Person();

        Person[] persons = new Person[3];
        persons[0] = sportsman;
        persons[1] = exercisedPerson;
        persons[2] = person;

        for (Person person1 : persons){
            person1.run();
        }

//        sportsman.run();
//        exercisedPerson.run();
//        person.run();
    }
}
