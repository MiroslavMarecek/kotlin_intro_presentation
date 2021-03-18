package example.a31NullSafeCalls;

public class a2_NullSafeCallJava {

    String getCoolingSystem(Computer computer) {

        // compiler doesn't tell us anything
        // we have to remember to do this manually
        if (computer.getGraphicsCard() != null) {
            return computer.getGraphicsCard().getCollingSystem();
        }
        return null;
    }

}
