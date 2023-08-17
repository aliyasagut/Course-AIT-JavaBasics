package homework23;

public class DogBowl {
    private String bowlColor;
    private String bowlMaterial;
    private int bowlSize;
    private String bowlPurpose;

    public DogBowl(String bowlColor) {
        this.bowlColor = bowlColor;
    }

    public String toString() {
        return "Миска цвета " + bowlColor;
    }

    public String getBowlColor() {
        return bowlColor;
    }

    public void setBowlColor(String bowlColor) {
        this.bowlColor = bowlColor;
    }

    public String getBowlMaterial() {
        return bowlMaterial;
    }

    public void setBowlMaterial(String bowlMaterial) {
        this.bowlMaterial = bowlMaterial;
    }

    public int getBowlSize() {
        return bowlSize;
    }

    public void setBowlSize(int bowlSize) {
        this.bowlSize = bowlSize;
    }

    public String getBowlPurpose() {
        return bowlPurpose;
    }

    public void setBowlPurpose(String bowlPurpose) {
        this.bowlPurpose = bowlPurpose;
    }
}
