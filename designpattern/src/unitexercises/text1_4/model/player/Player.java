package unitexercises.text1_4.model.player;

import unitexercises.text1_4.model.attackingmethod.AttackingMethod;
import unitexercises.text1_4.model.attackingmethod.NormalAttack;
import unitexercises.text1_4.model.equipment.weapon.Weapon;
import unitexercises.text1_4.model.log.GameEvent;
import unitexercises.text1_4.model.log.Observe;
import unitexercises.text1_4.model.log.Subject;

import java.util.ArrayList;

/**
 * @Author: 21246
 * @Date: 2026/7/28
 * @Description:
 */
public class Player implements Subject {
    private String name;
    private Weapon weapon;
    private double health;
    private String race;
    private ArrayList<Observe> observers = new ArrayList<>();
    private AttackingMethod currentAttackMethod = new NormalAttack();

    public Player(String name, String race) {
        this.name = name;
        this.race = race;
    }

    //进行攻击模式的算法切换
    public double attack() {
        double damage = currentAttackMethod.calculate(this.weapon);
        weapon.onAttack(this);
        notifyObservers(new GameEvent("ATTACKED", weapon.getDescription(), damage));
        return damage;
    }

    //提供观察者注册
    @Override
    public void registerObserver(Observe observe) {
        observers.add(observe);
    }

    //提供信息
    public void notifyObservers(GameEvent gameEvent) {
        for (Observe observer : observers) {
            observer.update(gameEvent);
        }
    }

    //玩家拾取武器
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        notifyObservers(new GameEvent("EQUIPPED", weapon.getDescription(), 0));
    }

    public AttackingMethod getCurrentAttackMethod() {
        return currentAttackMethod;
    }

    public void setCurrentAttackMethod(AttackingMethod currentAttackMethod) {
        this.currentAttackMethod = currentAttackMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


}