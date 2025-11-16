import java.util.ArrayList;
import java.util.List;
public class TestFighter {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Armor armor = new Armor("Steel Armor", 50);
        Weapon sword = new Weapon("Long Sword", 30);
        Weapon bow = new Weapon("Bow", 20);
        fighter.setArmor(armor);
        fighter.addWeapon(sword);
        fighter.addWeapon(bow);
        List<Weapon> weaponsList = fighter.getWeapons();
        weaponsList.remove(0);
        System.out.println("Sprzęt po próbie modyfikacji z zewnątrz: ");
        fighter.useEquipment();
    }
}