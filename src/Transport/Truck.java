package Transport;

public class Truck extends Transport {
    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал двигаться ");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил двигаться ");
    }
}
