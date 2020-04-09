package example.a70Sugarcoat;

import example.a50Collections.Employee;

public class SugarcoatJava {
    void sugarcoat() {
        // type must be stated explicitly
        String a = "a";

        // need to write 'new'
        Employee b = new Employee();

        // new constructor/field assignment
        Employee c = new Employee();
        c.setAge(42);

        // ugly equals
        "foo".equals("bar");

        // verbose Strings
        String s = "Emp data: age:" + c.getAge() + " city: " + c.getCity();

        // maybe NPE?
        b.getAge();

        // wordy assignment with condition
        boolean condition = true;
        Integer x;
        if (condition) {
            x = 13;
        } else {
            x = 100;
        }


        // must write semicolons
        // ;(
    }
}
