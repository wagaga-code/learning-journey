package unitexercises.text1_4;

import unitexercises.text1_4.model.attackingmethod.HeavyBlow;
import unitexercises.text1_4.model.attackingmethod.NormalAttack;
import unitexercises.text1_4.model.attackingmethod.PrecisionStrike;
import unitexercises.text1_4.model.decoration.FlameEnchantment;
import unitexercises.text1_4.model.decoration.FrostEnchantment;
import unitexercises.text1_4.model.equipment.weapon.Weapon;
import unitexercises.text1_4.model.factory.ElvenFactory;
import unitexercises.text1_4.model.factory.EquipmentFactory;
import unitexercises.text1_4.model.log.Systemlog;
import unitexercises.text1_4.model.player.Player;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        // 1. 创建日志系统并注册为观察者
        Player player = new Player("小明", "neige");
        player.registerObserver(new Systemlog());

        // 2. 工厂创建武器
        EquipmentFactory workshop = new ElvenFactory();
        Weapon weapon = workshop.createWeapon(EquipmentFactory.WeaponType.SWORD);

        // 3. 装备武器（自动输出日志）
        player.setWeapon(weapon);

        // 4. 普通攻击
        player.attack();

        // 5. 附魔（火焰 + 冰霜叠加）
        weapon = new FlameEnchantment(weapon);
        weapon = new FrostEnchantment(weapon);
        player.setWeapon(weapon);  // 重新装备，触发日志

        // 6. 切换攻击方式为重击
        player.setCurrentAttackMethod(new HeavyBlow());
        player.attack();  // 输出附魔后的重击伤害

        // 7. 再切换为精准打击
        player.setCurrentAttackMethod(new PrecisionStrike());
        player.attack();
    }
}
