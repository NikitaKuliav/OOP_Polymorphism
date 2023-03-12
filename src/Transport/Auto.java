package Transport;

public class Auto extends Transport {

    public Auto(String brand,
                String model,
                double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал двигаться ");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил двигаться ");
    }
}
