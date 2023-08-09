package homework17;

public class MainPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.whoIAm());

        Phone phone1 = new Phone("+08912345", "iPhone", 173);
        System.out.println("Here is the Phone: " + phone1.whoIAm());
        phone1.receiveCall("Anna", 178112233);
        System.out.println("Phone1 number: " + phone1.getNumber() + "\n");

        Phone phone2 = new Phone("+08954321", "Samsung", 157);
        System.out.println("Here is the Phone: " + phone2.whoIAm());
        phone2.receiveCall("Jack", 123887766);
        System.out.println("Phone2 number: " + phone2.getNumber() + "\n");

        Phone phone3 = new Phone("+08919876", "Xiaomi", 189);
        System.out.println("Here is the Phone: " + phone3.whoIAm());
        phone3.receiveCall("Peter", 897445566);
        System.out.println("Phone3 number: " + phone3.getNumber() + "\n");

    }
}
