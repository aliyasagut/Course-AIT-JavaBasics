package homework23;

public class DogBreed {
    private String breedName;

    private final Dog dog;

    public DogBreed(String breedName, Dog dog) {
        this.breedName = breedName;
        this.dog = dog;
    }

    public String toString() {
        return "Порода собаки: " + breedName;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }
}
