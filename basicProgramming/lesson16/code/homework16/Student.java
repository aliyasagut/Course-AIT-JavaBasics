package homework16;

public class Student {
    String name;
    int age;
    String educationalInstitution;
    int averageNote;
    String commentOfTeacher;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name, String university, int averageNote){
        this.name = name;
        this.educationalInstitution = university;
        this.averageNote = averageNote;
    }

    void attendLessons(){
        System.out.println("I am on a lesson");
    }
    void doHomework(){
        System.out.println("I am doing homework");
    }
    void feelSick(){
        System.out.println("I skip lessons today");
    }
}
