package myownpractice.interfacepractice;

public class AnimalBehavior {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.animalSound();
        horse.animalGender();
        horse.animalFood();
        horse.farmRoom();

        System.out.println("***********************************");

        Dog dog = new Dog();
        dog.animalSound();
        dog.animalGender();
        dog.animalFood();
        dog.farmRoom();

    }

}
