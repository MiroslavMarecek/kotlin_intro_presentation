package example.a10NullSafety;

public class ExampleDaoJava {

    public String getSomeData(int id) throws Exception {
        SomeExternalSystem external = new SomeExternalSystem();

        String out = external.getSomeData(id);

        // Java compiler doesn't know that this method
        // can only return null
        return null;

//        if (out == null) {
//            throw new Exception();
//        } else {
//            return out;
//        }
    }

}
