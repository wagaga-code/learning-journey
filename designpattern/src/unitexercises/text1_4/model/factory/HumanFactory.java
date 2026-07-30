package unitexercises.text1_4.model.factory;

import unitexercises.text1_4.model.equipment.weapon.Axe;
import unitexercises.text1_4.model.equipment.weapon.Bow;
import unitexercises.text1_4.model.equipment.weapon.Sword;
import unitexercises.text1_4.model.equipment.weapon.Weapon;
import unitexercises.text1_4.model.equipment.Armor.Armor;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:
 */
public class HumanFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon(WeaponType type) {
        switch (type) {
            case SWORD: return new Sword("¸Ö½£", 15);
            case BOW: return new Bow("Ë«ÊÖåó", 10);
            case AXE: return new Axe("Ìú¸«", 20);
            default: throw new IllegalArgumentException("Î´ÖªÎäÆ÷ÀàÐÍ: " + type);
        }
    }

    @Override
    public Armor createArmor(String name) {
        return null;
    }
}