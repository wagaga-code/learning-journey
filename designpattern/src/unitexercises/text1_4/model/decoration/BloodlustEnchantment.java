package unitexercises.text1_4.model.decoration;

import unitexercises.text1_4.model.equipment.weapon.Weapon;
import unitexercises.text1_4.model.player.Player;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:吸血附魔
 */
public class BloodlustEnchantment extends WeaponDecoration {
    public BloodlustEnchantment(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getDescription() {
        return weapon.getDescription() + "具有吸血能力";
    }

    @Override
    public int getDamage() {

        return weapon.getDamage() + 3;
    }

    @Override
    public void onAttack(Player attacker) {
        attacker.setHealth(attacker.getHealth() + 3);
        System.out.println("  吸血附魔触发：回复 3 点生命");
    }
}