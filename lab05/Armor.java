public class Armor extends Item {
    private int defense;
    public Armor(String name, int defense) {
        super(name);
        this.defense = defense;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    @Override
    public void use() {
        System.out.println("Equipping armor " + name + " with defense " + defense);
    }
}
