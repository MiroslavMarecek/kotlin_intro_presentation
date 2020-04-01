package example.a50Collections;

import com.sun.istack.internal.NotNull;
import example.City;
import example.Employee;

import java.util.List;

public class CollectionsJava {

    // SOURCE: https://www.emanprague.com/en/blog/kotlin-top-10-features-youll-love/
    public double getAverageAge(@NotNull List<Employee> employees) {
        int ageSum = 0;
        int count= 0;

        for (Employee employee : employees) {
            if (City.PILSEN.equals(employee.city)) {
                ageSum += employee.age;
                count++;
            }
        }

        if (count == 0) return 0;

        return ageSum / count;
    }
}
