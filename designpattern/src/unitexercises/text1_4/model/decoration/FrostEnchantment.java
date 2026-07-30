package unitexercises.text1_4.model.decoration;

import unitexercises.text1_4.model.equipment.weapon.Weapon;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:±ùËª¸½Ä§
 */
public class FrostEnchantment extends WeaponDecoration{
    public FrostEnchantment(Weapon weapon) {
        super(weapon);
    }
    @Override
    public String getDescription() {
        return weapon.getDescription()+"¸²¸Ç×Åº®Ëª";
    }
    @Override
    public int getDamage() {
        return weapon.getDamage()+5;
    }
}