package homework23;

import homework22.DomesticAnimal;

public class Cat extends DomesticAnimal {


    public Cat(String name, int age, boolean isVaccinated, String gender) {
        super(name, age, isVaccinated, gender);
    }

    public String toString() {
        return "{ Cat name: " + getName() + "; age: " + getAge() + "; gender: " + getGender() + "; is vaccinated: " + isVaccinated() + " }";
    }

    public void sayMiau() {
        System.out.println("Мяаауу!");
    }

    public void catchMouse() {
        System.out.println("Мышка поймана! Держи, хозяин!");
    }

}
