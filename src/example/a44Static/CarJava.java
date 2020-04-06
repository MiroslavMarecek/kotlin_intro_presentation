package example.a44Static;

import java.util.List;

public class CarJava {
    public static List<CarJava> cars;
    public Integer horsepowers;

    public CarJava(int horsepowers) {
    }

    public static CarJava makeCar(int horsepowers) {
        CarJava car = new CarJava(horsepowers);
        cars.add(car);
        return car;
    }

    public Integer getHorsepowers() {
        return horsepowers;
    }

}
