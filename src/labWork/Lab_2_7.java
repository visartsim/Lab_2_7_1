//Labs 2-7-1, 2-7-2, 2-7-3, 2-7-4,
package labWork;

class Device{
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer =" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;
        if (!serialNumber.equals(device.serialNumber)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }
}

//class Monitor
class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;
    //constructor class Monitor
    public Monitor(int resolutionX, int resolutionY, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: manufacturer= " + super.getManufacturer() +
                ", price=" + super.getPrice() +
                ". serialNumber=" + super.getSerialNumber() +
                ", X=" + resolutionX +
                ", Y=" + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        if (resolutionY != monitor.resolutionY) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}

class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
//main class
public class Lab_2_7{
    //entry point
    public static void main(String[] args) {
        Device device01 = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(device01.toString());
        Monitor monitor01 = new Monitor(1280, 1024, "Samsung", 120, "AB1234567CD");
        System.out.println(monitor01.toString());

        //вывод результатов работы методов equals
        System.out.println(device01.equals(monitor01));

        System.out.println(monitor01.equals(device01));

        //вывод результатов работы методов hashCode
        System.out.println("Device hashcode = " + device01.hashCode());
        System.out.println("Monitor hashcode = " + monitor01.hashCode());
    }
}