public class zad5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Burek", 5);
        Dog dog2 = new Dog("Azor", 10);
        Animal animal = new Animal("Tajemnicze Stworzenie", 3);
        Dog olderDog = AnimalUtils.findMax(dog1, dog2);
        System.out.println("Starszy pies: " + olderDog);
        Animal olderAnimal = AnimalUtils.findMax(dog1, animal);
        System.out.println("Starsze zwierzę: " + olderAnimal);
    }
}
