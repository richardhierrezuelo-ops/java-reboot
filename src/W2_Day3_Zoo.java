public class W2_Day3_Zoo {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Dog(), new Cat(), new Dog(),
                new Cow(), new Cat(), new Pig()
        };

        System.out.println("Welcome to the Zoo!");
        System.out.println("----------------------");

        for (Animal animal : zoo) {
            animal.speak();           // Runtime polymorphism in action!
        }

        System.out.println("----------------------");
        System.out.println("End of show!");
    }
}

//// Base class — DO NOT MODIFY
//class Animal {
//    public void speak() {
//        System.out.println("???");
//    }
//}
//
//// Already completed yesterday — DO NOT MODIFY
//class Dog extends Animal {
//    @Override
//    public void speak() {
//        System.out.println("Woof!");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    public void speak() {
//        System.out.println("Meow!");
//    }
//}

// YOUR TASK: Add these two new animals
class Cow extends Animal {
    // TODO: Make it say "Moo!"
    @Override
    public void speak() {
        System.out.println("Moo!");
    }
}

class Pig extends Animal {
    // TODO: Make it say "Oink!"
    @Override
    public void speak() {
        System.out.println("Oink!");
    }
}
