import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Modify {
    static void formatPerson(Person p) {
        p.setName(p.getName().toUpperCase());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();

        Person person = new Person(name, age);

        if (type.equalsIgnoreCase("fp")) {
            Modify.formatPerson(person);
        }

        System.out.println("Full name: " + person.getName() + "; " + person.getAge() + " years old.");
    }
}
