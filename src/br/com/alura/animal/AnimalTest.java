package br.com.alura.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog01 = new Dog("Doug", "Cachorro", "Caramelo", 7);
        Cat cat01 = new Cat("Jolie", "Gato", "Malhado", 5);

        dog01.displaysInfo();
        cat01.displaysInfo();

        dog01.makeSound();
        cat01.makeSound();

        dog01.waggingTail();
        cat01.scratchFurniture();
    }
}
