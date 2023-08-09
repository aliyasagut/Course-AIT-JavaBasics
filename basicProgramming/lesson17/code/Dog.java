public class Dog {
    String name;
    int jumpHeight;
    int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    boolean getBarrier(int barrierHeight) { // {120, 150, 180, 280, 350, 50}
        boolean result = false;
        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            while (jumpHeight < barrierHeight) {
                training();
            }
        }
        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
            System.out.println("End get barrier. Current jump: " + jumpHeight);
            return result = true;
        } else {
            System.out.println("I cant jump over barrier, it's too high: " + barrierHeight + " !");
            System.out.println("End get barrier. Current jump: " + jumpHeight);
            return result;
        }
    }

    void training() {
        System.out.println("Start training...");
        if (jumpHeight + 10 <= maxJumpHeight) {
            jumpHeight += 10;
            System.out.println("I finished training.");
            whoAmI();
        } else {
            System.out.println("I can't jump anymore! Sorry!");
        }
    }

    void jump() {
        System.out.println("I am jumping!");
    }

    void jump(int height) {
        System.out.println("I am jumping over barrier " + height + " sm!");
    }

    void whoAmI() {
        System.out.println("I am " + name + ". I can jump  " + jumpHeight + " sm!");
    }

}
