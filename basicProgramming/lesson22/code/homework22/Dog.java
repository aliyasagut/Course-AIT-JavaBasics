package homework22;

public class Dog extends DomesticAnimal {

    private boolean isTrainedToJump;

    public Dog(String name, int age, boolean isVaccinated, String gender, boolean isTrainedToJump) {
        super(name, age, isVaccinated, gender);
        this.isTrainedToJump = isTrainedToJump;
    }

    public String toString(){
        return "{ Dog name: " + getName() + "; age: " + getAge() + "; gender: " + getGender() + "; is vaccinated: " + isVaccinated() + "; Trained; "+ isTrainedToJump() + " }";
    }

    public void sayGav(){
        System.out.println("Гав-гав!");
    }

    public void jump(){
        System.out.println("Я прыгаю!");
    }
    public boolean isTrainedToJump() {
        return isTrainedToJump;
    }

    public void setTrainedToJump(boolean trained) {
        isTrainedToJump = trained;
    }
}
