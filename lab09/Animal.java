class Animal implements Comparable<Animal>{
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.age, o.getAge());
    }
    @Override
    public String toString() {
        return name + " (" + age +" lat)";
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
}
