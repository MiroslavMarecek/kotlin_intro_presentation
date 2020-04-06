package example.a31NullSafeCalls;

//              "Safe"
public class NullSafeCallJava {
    String getCoolingSystem(Computer computer) {

        // compiler doesn't tell us anything
        // we have to remember to do this manually
        if (computer.getGraphicsCard() != null) {
            // we can use data classes from Java, too
            return computer.getGraphicsCard().getCollingSystem();
        }
        return null;
    }
}
