package unitexercises.text1_4.model.log;

/**
 * @Author: 21246
 * @Date: 2026/7/29
 * @Description:
 */
public class GameEvent {
    //三种通知
    private String eventType;
    private String weaponName;
    private double damage;

    public GameEvent(String eventType, String weaponName, double damage) {
        this.eventType = eventType;
        this.weaponName = weaponName;
        this.damage = damage;
    }

    public GameEvent() {
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}