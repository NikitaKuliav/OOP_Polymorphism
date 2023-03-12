import Transport.*;

public class Main {
    public static void main(String[] args) {

        for (int i =1; i<=4;i++){
            DriverB driverB = new DriverB("категории B  № " + i,
                    true,
                    5 +i);
            Auto auto = new Auto (
                    "Auto brand #" + i,
                    "Auto model #" + i,
                    2.0,
                    driverB
            );
            DriverC driverC = new DriverC("категории С  № " + i,
                    true,
                    10 +i);
            Truck truck = new Truck (
                    "Truck brand #" + i,
                    "Truck model #" + i,
                    6.5,
                    driverC
            );
            DriverD driverD = new DriverD("категории D  № " + i,
                    true,
                    7 +i);

            Bus bus = new Bus (
                    "Bus brand #" + i,
                    "bus model #" + i,
                    4.5,
                    driverD
                    );
            printInfo(auto);
            printInfo(bus);
            printInfo(truck);
        }

    }
    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}