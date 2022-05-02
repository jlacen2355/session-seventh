package myownpractice.interfacepractice;

public class Dog implements AnimalSpecs, FarmHouse{

    public void animalSound() {
        System.out.println("Dog sound: 'grrrr wao, grrrr wao'");
    }

    public void animalGender() {
        System.out.println("Dog gender: Female");
    }

    public void animalFood() {
        System.out.println("Dog Food: Dog Cookies");
    }

    public void farmRoom() {
        System.out.println("Dog Room: House Room");
    }
}
