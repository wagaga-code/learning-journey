package headfirst.chapterthree;

/**
 * @Author: 21246
 * @Date: 2026/7/27
 * @Description:
 */
public abstract class Weapon {
    protected int baseDamage;      //  protected：让子类能直接用
    protected String description;  //  protected：让子类能直接用

    public Weapon(int baseDamage, String description) {
        this.baseDamage = baseDamage;
        this.description = description;
    }

    public abstract int damage();        // 强制子类实现
    public abstract String getDescription();
}