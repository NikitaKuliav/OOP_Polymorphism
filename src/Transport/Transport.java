package Transport;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.equals("")) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.equals("")) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }

    public abstract void startMove();
    public abstract void finishMove();

    @Override
    public String toString() {
        return
                "марка='" + brand + '\'' +
                        ", модель='" + model + '\'' +
                        ", объем двигателя=" + engineVolume;

    }
}
