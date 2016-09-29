package Storm;

import java.util.Date;

public class Device {
    private static int number = 0;
    private int deviceId;
    private String brand;
    private String deviceType;
    private String color;
    private Date releaseDate;
    public int getDeviceId() {
        return deviceId;
    }




    //конструктор
    private Device(int deviceId, String brand, String deviceType, String color, Date releaseDate) {
        this.deviceId = deviceId;
        this.brand = brand;
        this.deviceType = deviceType;
        this.color = color;
        this.releaseDate = releaseDate;
    }
    static public Device createDevice(String brand, String deviceType, String color, Date releaseDate) {
        return new Device(number++, brand, deviceType, color, releaseDate);
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId=" + deviceId +
                ", brand='" + brand + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", color='" + color + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

    //геттеры и сеттеры
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getDeviceType() {
        return deviceType;
    }
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
