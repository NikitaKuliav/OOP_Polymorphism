package Transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String bodyColor, int maxSpeed) {
        if (brand == null || brand.equals("")) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.equals("")) {
            model = "default";
        }
        this.model = model;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.equals("")) {
            country = "default";
        }
        this.country = country;
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if ((bodyColor==null) || bodyColor.isEmpty()) {
            bodyColor = "white";
        }
        this.bodyColor = bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 180;
        }
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return
                "марка='" + brand + '\'' +
                        ", модель='" + model + '\'' +

                        ", цвет='" + bodyColor + '\'' +
                        ", год=" + year +
                        ", страна сборки='" + country + '\'' +
                        ", максимальная скорость='" + maxSpeed + '\'';

    }
}
