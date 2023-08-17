package homework23;


public class Main {
    public static void main(String[] args) {
        DomesticAnimal domesticAnimal = new DomesticAnimal("Loli", 10, true, "femine");
        System.out.println("Я домашнее животное по имени " + domesticAnimal.getName() + ". Мне " + domesticAnimal.getAge() + " лет. Вакцинирована: " + domesticAnimal.isVaccinated());

        System.out.println("\n--------------\n");

        Cat cat = new Cat("Fifi", 2, true, "femine");
        System.out.println(cat.toString());
        cat.sayMiau();
        cat.catchMouse();

        System.out.println("\n--------------\n");

        DogBowl dogBowl = new DogBowl("rot");
        Dog dog = new Dog("Boby", 4, false, "male", true);
        dog.setDogBowl(dogBowl);
        System.out.println(dog.toString());
        dog.sayGav();
        dog.jump();

    }
}
