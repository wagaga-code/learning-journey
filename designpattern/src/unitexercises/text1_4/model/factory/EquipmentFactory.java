package unitexercises.text1_4.model.factory;

import unitexercises.text1_4.model.equipment.weapon.Weapon;
import unitexercises.text1_4.model.equipment.Armor.Armor;

//定义抽象工厂
public interface EquipmentFactory {
    public enum WeaponType {
        SWORD, BOW, AXE
    }
    //定义工厂必须可以锻造剑和护甲
    public Weapon createWeapon(ElvenFactory.WeaponType Type);
    Armor createArmor(String name);

}
