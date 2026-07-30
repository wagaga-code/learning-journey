package unitexercises.text1_4.model.decoration;

import unitexercises.text1_4.model.equipment.weapon.Weapon;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:装饰者抽象类
 */
public class WeaponDecoration extends Weapon {
    protected Weapon weapon;
    public WeaponDecoration(Weapon weapon) {
        super("", 0);
        this.weapon=weapon;
    }
    //虽然没有办法直接获得对象的属性，但是可以一直间接的通过方法，最终获得对象的属性。
    @Override
    public int getDamage() {
        return weapon.getDamage();
    }

    @Override
    public String getDescription() {
        return weapon.getDescription();
    }

}