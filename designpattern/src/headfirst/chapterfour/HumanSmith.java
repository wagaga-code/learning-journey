package headfirst.chapterfour;

import headfirst.chapterthree.Sword;
import headfirst.chapterthree.Weapon;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:»À¿‡Ã˙Ω≥
 */
public class HumanSmith extends WeaponSmith {

    @Override
    Weapon forgeWeapon(String description) {
        if (description.equalsIgnoreCase("HumanSword")) {
            return new Sword();
        }
        return null;
    }

}