import animals.Dog;
import animals.Cat;
public class TestAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Burek";
        dog.age = 3;
        Cat cat = new Cat();
        cat.name = "Mruczek";
        cat.age = 2;
        System.out.println(dog.name + " mówi: ");
        dog.makeSound();
        System.out.println(cat.name + " mówi: ");
        cat.makeSound();
    }
}
