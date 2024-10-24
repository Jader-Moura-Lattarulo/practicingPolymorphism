package br.com.alura.animal;

public class Cat extends Animal{
    public Cat(String name, String specie, String race, int age) {
        super(name, specie, race, age);
    }

    @Override
    public void makeSound(){
        System.out.println("Miau Miau");
    }

    public void scratchFurniture(){
        System.out.printf("""
                A %s está arranhando os movéis.
                """, getName());
    }
}
