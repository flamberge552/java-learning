/*
 * In this file I'm demonstrating inheritance and polymorhpism.
 */

package animal;

class Animal {
    int size = 3;
}

class Mammal extends Animal {
//    int size = 4;
}

class Dog extends Mammal {
    int size = 5;
    Dog(int newSize) {
        this.size = newSize;
    }
}

class Pupper extends Dog {
    int size = 1;
    Pupper(int newSize) {
        super(newSize);
    }
}

public class Main {
    public static void main(String... args) {
        Pupper pupper = new Pupper(2);
        Mammal animal;
        animal = (Mammal) pupper;
        System.out.println(pupper.size);
        System.out.println(animal.size);
    }
}
