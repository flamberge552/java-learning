package animal2;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void eat() {
        System.out.println("animal is eating...");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("cat is eating...");
    }

    public void meow() {
        System.out.println("meow");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("dog is eating...");
    }

    public void bark() {
        System.out.println("woof");
    }
}

class AnimalFeeder {
    public static void feed(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}

public class Main {
    public static void main(String... args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        AnimalFeeder.feed(animals);
    }
}
