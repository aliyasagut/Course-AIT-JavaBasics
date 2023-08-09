public class MainDog {
    public static void main(String[] args) {
        System.out.println("==== Dog 1 Barbos ====");

        Dog dog1 = new Dog("Barbos", 50);

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }

        System.out.println("Jump height: " + dog1.jumpHeight);
        System.out.println("Max jump height: " + dog1.maxJumpHeight);


        System.out.println("==== Dog Rex ====");

        Dog dog = new Dog("Rex", 150);

        System.out.println(dog.jumpHeight);
        System.out.println(dog.maxJumpHeight);

        int[] barriers = {120, 150, 180, 280, 350, 50, 400, 300, 320, 10};
        int counter = 0;
        for (int barrier : barriers) {
            if (dog.getBarrier(barrier)) counter++;
        }
        System.out.println("I have jumped " + counter + " times!");
    }
}
