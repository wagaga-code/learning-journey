package unitexercises.text1_4.model.attackingmethod;

import unitexercises.text1_4.model.equipment.weapon.Weapon;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:
 */
public class HeavyBlow implements AttackingMethod {

    @Override
    public double calculate(Weapon weapon) {
        return weapon.getDamage()*1.5;
    }
}