package headfirst.chaptertwo.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 21246
 * @Date: 2026/7/26
 * @Description:
 */
public class Weather implements Subject {
    private List<Observe> objects = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double indspeed;
    private double atmosphericPressure;

    //注册成为观察者
    public void registration(Observe o) {
        objects.add(o);
    }

    //注销观察者
    public void logout(Observe o) {
        objects.remove(o);
    }

    //提供数据
    public void disbursementDate() {
        for (Observe object : objects) {
            object.update(this);
        }
    }
    //更新数据
    public void changeDate(){
        disbursementDate();
    }

    public Weather(double temperature, double humidity, double indspeed, double atmosphericPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.indspeed = indspeed;
        this.atmosphericPressure = atmosphericPressure;
    }

    public Weather() {
    }

    public List<Observe> getObjects() {
        return objects;
    }

    public void setObjects(List<Observe> objects) {
        this.objects = objects;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getIndspeed() {
        return indspeed;
    }

    public void setIndspeed(double indspeed) {
        this.indspeed = indspeed;
    }

    public double getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(double atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "objects=" + objects +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", indspeed=" + indspeed +
                ", atmosphericPressure=" + atmosphericPressure +
                '}';
    }
}