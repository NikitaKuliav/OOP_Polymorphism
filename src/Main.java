import Transport.*;

public class Main {
    public static void main(String[] args) {
        Auto ladaGranta = new Auto("Lada", "Granta", 1.7, "Yellow",2015 ,"Russia", 140, "manual", "sedan", 123, 4, true, new Auto.Key(true,false));
        Auto audiA8 = new Auto("Audi", "A8 50 L TDI quattro", 3.0, "Black" , 2020, "Germany", 180, "manual", "sedan", 124, 4, true, new Auto.Key(true,true));
        Auto bmwZ8 = new Auto("BMW", "Z8", 3.0, "Black", 2021, "Germany", 190,"manual", "sedan", 125, 4, true, new Auto.Key(true,false));
        Auto kia = new Auto("KIA", "Sportage 4-го поколения", 3.0, "Red", 2018, "South Korea",160, "manual", "sedan", 126, 4, true, new Auto.Key(false,true));
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea", 160, "manual", "sedan", 127, 4, true, new Auto.Key(false,true));

        Auto test = new Auto("", null, 0, "", 0, null,120, "", "", 12, 1, true, null);

        test.changeTyre(2);



        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println(test);

        for (int i =1; i<=3;i++){
            Bus bus = new Bus (
                    "Bus brand #" + i,
                    "bus model #" + i,
                    2005 +i,
                    "Russia",
                    "Yellow",
                    130
                    );
            System.out.println(bus);

        }

    }
}