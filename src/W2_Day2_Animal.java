public class W2_Day2_Animal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speak();   // Expected: Woof!
        cat.speak();   // Expected: Meow!

        System.out.println("---");

        // Bonus challenge (optional today)
        Animal[] zoo = { new Dog(), new Cat(), new Dog() };
        for (Animal a : zoo) {
            a.speak();
        }
        // Expected: Woof! Meow! Woof!
    }
}

class Animal {
    public void speak() {
        System.out.println("???");
    }
}

class Dog extends Animal {
    // TODO: Override speak() to print "Woof!"
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    // TODO: Override speak() to print "Meow!"
    public void speak() {
        System.out.println("Meow!");
    }
}