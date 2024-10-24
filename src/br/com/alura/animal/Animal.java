package br.com.alura.animal;

public class Animal {
    private String name;
    private String specie;
    private String race;
    private int age;

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
