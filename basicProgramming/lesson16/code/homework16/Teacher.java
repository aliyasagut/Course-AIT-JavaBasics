package homework16;

public class Teacher {
    String name;
    String education;
    int experienceOfTeaching;
    int experienceOfWorking;
    String recommendations;

    public Teacher(String name, int yearsOfExperience, String education) {
        this.name = name;
        this.experienceOfTeaching = yearsOfExperience;
        this.education = education;
    }

    public Teacher(String name, String recommendations, int yearsOfWorking) {
        this.name = name;
        this.recommendations = recommendations;
        this.experienceOfWorking = yearsOfWorking;
    }

    void giveLectures() {
        System.out.println("I am on a Lecture");
    }

    void practiceWithStudents() {
        System.out.println("I am on a practice");
    }

    void answerQuestions() {
        System.out.println("all day long...");
    }

    void checkHomework() {
        System.out.println("I am checking homework");
    }

}
