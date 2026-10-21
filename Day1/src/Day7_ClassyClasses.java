//Task
//Your task is to complete this Class, the Person class has been created.
// You must fill in the Constructor method to accept a name as string and an age as number,
// complete the get Info property and getInfo method/Info getter which should return johns age is 34

public class Day7_ClassyClasses {
    public static void main(String[] args) {
        Person john = new Person("john", 34);
        System.out.println(john.info());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info() {
        return name + "s age is " + age;
    }
}
