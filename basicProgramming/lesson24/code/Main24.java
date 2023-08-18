public class Main24 {
    public static void main(String[] args) {
        Animal cat = new Cat3(); // восходящее преобразование
        Animal dog = new Dog1();
        Animal hamster = new Hamster();

        Cat3 cat1 = (Cat3) cat; // Низходящее преобразование
        cat1.eat();

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = hamster;

        for (Animal animal:animals){
            animal.voice();

            if(animal instanceof Cat3){
                Cat3 newCat = (Cat3) animal;
                newCat.eat();
            }
        }

//        cat.voice();
//        dog.voice();
//        hamster.voice();


    }
}
