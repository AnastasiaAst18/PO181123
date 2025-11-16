import java.util.ArrayList;
import java.util.List;

public class Fighter {
    private Armor armor;
    private List<Weapon> weapons = new ArrayList<>();
    public Armor getArmor() {
        return armor;
    }
    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public List<Weapon>  getWeapons() {
        return new ArrayList<>(weapons);
    }
    public void addWeapon(Weapon weapon)
    {
        weapons.add(weapon);
    }
    public void removeWeapon(Weapon weapon)
    {
        weapons.remove(weapon);
    }
    public void useEquipment()
    {
        if (armor != null)
        {
            armor.use();
        }
        for (Weapon w :  weapons)
        {
            w.use();
        }
    }
}