package br.com.alura.animal;

public class Animal {
    private final String name;
    private final String specie;
    private final String race;
    private final int age;

    public Animal(String name, String specie, String race, int age) {
        this.name = name;
        this.specie = specie;
        this.race = race;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void displaysInfo() {
        System.out.printf("""
                *************************************
                Espécie: %s
                Raça: %s
                Nome: %s
                Idade: %d
                *************************************
                """, this.specie, this.race, this.name, this.age);
    }

    public void makeSound() {
        System.out.println("Barulho!");
    }
}
