package headfirst.chapterthree;

/**
 * @Author: 21246
 * @Date: 2026/7/27
 * @Description:
 */
public class FireEnchantmentDecorator extends WeaponDecorator{


    public FireEnchantmentDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public int damage() {
        weapon.durability=weapon.durability-2;
        return weapon.baseDamage=weapon.baseDamage+5;
    }

    @Override
    public String getDescription() {
        return weapon.description=weapon.description+"»ðÑæ¸½Ä§";
    }
    public int getFireDamage() {
        return 5;
    }
}