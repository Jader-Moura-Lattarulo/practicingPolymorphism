package br.com.alura.animal;

public class Dog extends Animal{
    public Dog(String name, String specie, String race, int age) {
        super(name, specie, race, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Au au au!");
    }

    public void waggingTail() {
        System.out.printf("""
                O %s está abanando o rabo
                """, getName());
    }
}
