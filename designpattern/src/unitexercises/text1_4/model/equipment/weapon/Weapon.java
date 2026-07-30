package unitexercises.text1_4.model.equipment.weapon;

import unitexercises.text1_4.model.attackingmethod.AttackingMethod;
import unitexercises.text1_4.model.player.Player;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:
 */
public abstract class Weapon {
    //拥有主人属性后就可以很方便的对玩家的属性进行操控了。
    protected Player player;
    protected String description;
    protected int damage;
    //组合攻击模式
    protected AttackingMethod attackingmethod;

    public Weapon(String description, int damage) {
        this.description = description;
        this.damage = damage;
    }
    public abstract int getDamage();
    public abstract String getDescription();
    public void onAttack(Player attacker) {}


}