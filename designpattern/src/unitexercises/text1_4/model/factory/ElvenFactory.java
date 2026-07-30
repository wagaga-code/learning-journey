package unitexercises.text1_4.model.factory;

import unitexercises.text1_4.model.equipment.weapon.Axe;
import unitexercises.text1_4.model.equipment.weapon.Bow;
import unitexercises.text1_4.model.equipment.weapon.Sword;
import unitexercises.text1_4.model.equipment.weapon.Weapon;
import unitexercises.text1_4.model.equipment.Armor.Armor;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:精灵工厂
 */
public class ElvenFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon(WeaponType type) {
        switch (type) {
            case SWORD: return new Sword("细银剑", 15);
            case BOW: return new Bow("强力弩", 20);
            case AXE: return new Axe("木斧", 10);
            default: throw new IllegalArgumentException("未知武器类型: " + type);
        }
    }

    @Override
    public Armor createArmor(String name) {
        return null;
    }
}