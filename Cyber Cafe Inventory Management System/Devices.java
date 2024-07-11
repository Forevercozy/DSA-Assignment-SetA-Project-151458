    public class Devices {
    private String type;
    private String brand;

    public Devices(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Device{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
    