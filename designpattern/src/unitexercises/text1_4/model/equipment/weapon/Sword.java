package unitexercises.text1_4.model.equipment.weapon;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:½£
 */
public class Sword extends Weapon {
    public Sword(String name, int damage) {
        super(name, damage);
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getDescription() {
        return description;
    }
}