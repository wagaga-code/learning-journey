package headfirst.chapterfour;

import headfirst.chapterthree.Weapon;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:铁匠铺类来进行工厂练习
 */
public abstract class WeaponSmith {
    public Weapon orderWeapon(String description){
        Weapon weapon= forgeWeapon(description);
        weapon.polish();
        return  weapon;
    }
    abstract Weapon forgeWeapon(String description);

}