public interface LoudAnimal {
    void makeNoise();
}
class Dog implements LoudAnimal {
    @Override
    public void makeNoise() {
            System.out.println("Hau Hau! (Pies szczeka)");
    }
}
class Cat implements LoudAnimal {
    @Override
    public void makeNoise() {
        System.out.println("Miau miau! (Kot miauczy)");
    }
}
