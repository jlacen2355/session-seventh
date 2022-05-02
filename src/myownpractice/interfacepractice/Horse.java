package myownpractice.interfacepractice;

public class Horse implements AnimalSpecs, FarmHouse{

    public void animalSound() {
        System.out.println("Horse sound: 'brrrrr'");
    }

    public void animalGender() {
        System.out.println("Horse gender: Male");
    }

    public void animalFood() {
        System.out.println("Horse Food: grass");
    }

    public void farmRoom() {
        System.out.println("Horse Room: Horse Stable");
    }
}
