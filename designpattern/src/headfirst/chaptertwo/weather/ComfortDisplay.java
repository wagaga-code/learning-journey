package headfirst.chaptertwo.weather;

/**
 * @Author: 21246
 * @Date: 2026/7/26
 * @Description:
 */
public class ComfortDisplay implements Observe, display {
    private Weather weather;
    private double temperature;
    private double humidity;

    @Override
    public void update(Subject subject) {
        weather = (Weather) subject;
        this.temperature = weather.getTemperature();
        this.humidity = weather.getHumidity();
    }


    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ComfortDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}