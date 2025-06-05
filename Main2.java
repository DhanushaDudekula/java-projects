package dhanu;// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Dog subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball.");
    }
}

// Cat subclass
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }

    void climb() {
        System.out.println("Cat is climbing the tree.");
    }
}

// Main class to test
public class Main2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Dog behavior
        System.out.println("Dog Actions:");
        myDog.eat();
        myDog.sleep();
        myDog.makeSound();
        myDog.bark();
        myDog.fetch();

        // Cat behavior
        System.out.println("\nCat Actions:");
        myCat.eat();
        myCat.sleep();
        myCat.makeSound();
        myCat.meow();
        myCat.climb();
    }
}

