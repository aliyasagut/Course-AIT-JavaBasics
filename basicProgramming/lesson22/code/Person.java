public class Person {

    private String name;
    private boolean isKind;
    private boolean isHaveSpecialRequirements;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isKind() {
        return isKind;
    }

    public boolean isHaveSpecialRequirements() {
        return isHaveSpecialRequirements;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }

    public void setHaveSpecialRequirements(boolean haveSpecialRequirements) {
        isHaveSpecialRequirements = haveSpecialRequirements;
    }

    public void move(){
        System.out.println("I am moving");
    }
}
