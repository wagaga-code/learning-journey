package headfirst.chapterthree;

/**
 * @Author: 21246
 * @Date: 2026/7/27
 * @Description:
 */
public class BlessedEnchantmentDecorator extends WeaponDecorator {
    public BlessedEnchantmentDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getDescription() {
        // 正确做法：委托，并在结果后追加
        return weapon.getDescription() + "，笼罩圣光";
    }

    @Override
    public int damage() {
        // 正确做法：委托，并在结果上加 8
        return weapon.damage() + 8;
    }

}