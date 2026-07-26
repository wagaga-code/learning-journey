package headfirst.chaptertwo.weather;

/**
 * @Author: 21246
 * @Date: 2026/7/26
 * @Description:
 */
public class Text {
    public static void main(String[] args) {
        Weather weather = new Weather();  // 空构造器

        DisasterWarningScreen screen1 = new DisasterWarningScreen();
        ComfortDisplay screen2 = new ComfortDisplay();

        weather.registration(screen1);
        weather.registration(screen2);

        // 现在模拟数据变化
        weather.setTemperature(25.0);
        weather.setHumidity(60.1);
        weather.setIndspeed(15.5);
        weather.setAtmosphericPressure(1013.2);
        // 在最后一个 set 方法里，或者统一手动调用 disbursementDate() 来通知
        weather.changeDate();
        screen1.display();
        screen2.display();
    }
}