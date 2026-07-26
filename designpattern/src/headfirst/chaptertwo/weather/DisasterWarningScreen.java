package headfirst.chaptertwo.weather;

/**
 * @Author: 21246
 * @Date: 2026/7/26
 * @Description:
 */
public class DisasterWarningScreen implements Observe, display {
    private double indspeed;
    private double atmosphericPressure;
    private Weather weather;

    @Override
    public void update(Subject subject) {
        weather=(Weather)subject;
        this.indspeed = weather.getIndspeed();
        this.atmosphericPressure = weather.getAtmosphericPressure();

    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DisasterWarningScreen{" +
                "indspeed=" + indspeed +
                ", atmosphericPressure=" + atmosphericPressure +
                '}';
    }
}