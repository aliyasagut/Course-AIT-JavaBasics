package homework23;

import homework22.DomesticAnimal;

public class Dog extends DomesticAnimal {

    private boolean isTrainedToJump;
    private final DogBreed dogBreed; // composition
    private DogBowl dogBowl; // aggregation

    public Dog(String name, int age, boolean isVaccinated, String gender, boolean isTrainedToJump) {
        super(name, age, isVaccinated, gender);
        this.isTrainedToJump = isTrainedToJump;
        this.dogBreed = new DogBreed("Овчарка", this);
    }

    public String toString() {
        return "{ Dog name: " + getName() + "; age: " + getAge() + "; gender: " + getGender() +
                "; is vaccinated: " + isVaccinated() + "; Trained; " + isTrainedToJump() +
                "; Dog breed: " + dogBreed.toString() + "; Личная миска: " + dogBowl.toString() + " }";
    }

    public DogBowl getDogBowl() {
        return dogBowl;
    }

    public void setDogBowl(DogBowl dogBowl) {
        this.dogBowl = dogBowl;
    }

    public void sayGav() {
        System.out.println("Гав-гав!");
    }

    public void jump() {
        System.out.println("Я прыгаю!");
    }

    public boolean isTrainedToJump() {
        return isTrainedToJump;
    }

    public void setTrainedToJump(boolean trained) {
        isTrainedToJump = trained;
    }
}
