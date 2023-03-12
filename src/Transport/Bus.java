package Transport;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал двигаться ");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил двигаться ");
    }
}