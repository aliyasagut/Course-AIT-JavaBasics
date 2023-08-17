package homework23;

public class DomesticAnimal {
    private String name;
    private int age;
    private String gender;
    private boolean isVaccinated;

    public DomesticAnimal(String name, int age, boolean isVaccinated, String gender) {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
