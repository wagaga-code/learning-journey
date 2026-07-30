package unitexercises.text1_4.model.equipment.weapon;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:
 */
public class Bow extends Weapon {
    public Bow(String name, int damage) {
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