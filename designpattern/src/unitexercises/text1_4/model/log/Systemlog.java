package unitexercises.text1_4.model.log;

/**
 * @Author: 21246
 * @Date: 2026/7/29
 * @Description:
 */
public class Systemlog implements Observe {


    @Override
    public void update(GameEvent event) {
        switch (event.getEventType()) {
            case "EQUIPPED":
                System.out.println("[系统] 玩家装备了：" + event.getWeaponName());
                break;
            case "ENCHANTED":
                System.out.println("[系统] 武器被附魔：" + event.getWeaponName());
                break;
            case "ATTACKED":
                System.out.println("[系统] " + event.getWeaponName()
                        + " 造成伤害：" + event.getDamage());
                break;
        }
    }
}