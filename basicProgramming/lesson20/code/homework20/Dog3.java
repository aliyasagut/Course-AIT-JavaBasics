package homework20;

public class Dog3 {
    private String name;
    private int jumpHeight;
    private int maxJumpHeight;
    private int increaseByTraining = 10;
    static final int MULTIPLIER = 2;
    private static int counterOfJumps = 0;

    public Dog3(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * Dog3.MULTIPLIER;
    }

    public Dog3() {

    }

    public static int getCounterOfJumps(){
        return Dog3.counterOfJumps;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getMaxJumpHeight() {
        return this.maxJumpHeight;
    }

    public int getIncreaseByTraining() {
        return this.increaseByTraining;
    }

    public void setName(String string) {
        this.name = string;
    }

    public void setJumpHeight(int jumpHeight) {
        if (jumpHeight < 0) this.jumpHeight = 0;
        this.jumpHeight = jumpHeight;
    }

    public void setIncreaseByTraining(int increaseByTraining) {
        if (increaseByTraining < 0) this.increaseByTraining = 0;
        this.increaseByTraining = increaseByTraining;
    }


    public boolean getBarrier(int barrierHeight) { // {120, 150, 180, 280, 350, 50}
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

    public void training() {
        System.out.println("Start training...");
        if (jumpHeight + increaseByTraining <= maxJumpHeight) {
            jumpHeight += increaseByTraining;
            System.out.println("I finished training.");
            whoAmI();
        } else if (maxJumpHeight - jumpHeight < increaseByTraining) {
            System.out.println("Small training start: jump = " + jumpHeight + "; max = " + maxJumpHeight);
            jumpHeight = maxJumpHeight;
        } else {
            System.out.println("I can't jump anymore! Sorry!");
        }
    }

    private void jump() {
        System.out.println("I am jumping!");
    }

    private void jump(int height) {
        Dog3.counterOfJumps++;
        System.out.println("I am jumping over barrier " + height + " sm!");
    }

    public void whoAmI() {
        System.out.println("I am " + name + ". I can jump  " + jumpHeight + " sm!");
    }

}
