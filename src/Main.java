import Transport.*;

public class Main {
    public static void main(String[] args) {

        for (int i =1; i<=4;i++){
            Auto auto = new Auto (
                    "Auto brand #" + i,
                    "Auto model #" + i,
                    2.0
            );

            Truck truck = new Truck (
                    "Truck brand #" + i,
                    "Truck model #" + i,
                    6.5
            );


            Bus bus = new Bus (
                    "Bus brand #" + i,
                    "bus model #" + i,
                    4.5
                    );
            System.out.println(auto);
            System.out.println(truck);
            System.out.println(bus);
        }
    }
}