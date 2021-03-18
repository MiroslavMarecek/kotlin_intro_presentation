package example.a50Collections;

import java.util.List;
import java.util.stream.Collectors;

public class a2_CollectionsJava {

    // SOURCE: https://www.emanprague.com/en/blog/kotlin-top-10-features-youll-love/
    public double getAverageAge(List<Employee> employees) {
        List<Integer> filteredEmps = employees.stream()
                .filter(e -> City.PILSEN.equals(e.getCity())) // <- having to deal with null checks again...
                .map(Employee::getAge).collect(Collectors.toList());

        int ageSum = 0;
        for (Integer age : filteredEmps) {
                ageSum = ageSum + age;
        }
        return Math.floorDiv(ageSum, filteredEmps.size());
    }
}
