public class Cat2 {
    private String name;
    private int age;
    private double weight;

    public Cat2(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat2() {

    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }

    public void setName(String string){
        this.name = string;
    }
    public void setAge(int age){
        if (age <0){
            age = 0;
        }
        this.age = age;
    }
    public void setWeight(double weight){
        if (weight < 0){
            weight = 0;
        }
        this.weight = weight;
    }
}
