package headfirst.chapterthree;

/**
 * @Author: 21246
 * @Date: 2026/7/27
 * @Description:
 */
public abstract class WeaponDecorator extends Weapon{
    protected Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        super(0,"");
        this.weapon= weapon;
    }
    public int damage() {
        return weapon.damage();
    }

    public String getDescription() {
        return weapon.getDescription();
    }


}