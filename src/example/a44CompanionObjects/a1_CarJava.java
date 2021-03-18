package example.a44CompanionObjects;

import java.util.List;

public class a1_CarJava {
    public static List<a1_CarJava> cars;
    public Integer horsepowers;

    private a1_CarJava(int horsepowers) {
    }

    public Integer getHorsepowers() {
        return horsepowers;
    }


    public static a1_CarJava makeCar(int horsepowers) {
        a1_CarJava car = new a1_CarJava(horsepowers);
        cars.add(car);
        return car;
    }

}
