package unitexercises.text1_4.model.decoration;

import unitexercises.text1_4.model.equipment.weapon.Weapon;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:»ðÑæ¸½Ä§
 */
public class FlameEnchantment extends WeaponDecoration{
    public FlameEnchantment(Weapon weapon) {
        super(weapon);
    }
    @Override
    public String getDescription() {
        return weapon.getDescription()+"È¼ÉÕÕß»ðÑæ";
    }
    @Override
    public int getDamage() {
        return weapon.getDamage()+8;
    }

}