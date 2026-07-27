package headfirst.chapterthree;

/**
 * @Author: 21246
 * @Date: 2026/7/27
 * @Description:
 */
public class Sword extends Weapon{

    public Sword() {
        super(10, "Ìú½£");
    }

    @Override
    public int damage() {
        return baseDamage;
    }

    @Override
    public String getDescription() {
        return description;
    }
}