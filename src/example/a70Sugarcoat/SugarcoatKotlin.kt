package example.a70Sugarcoat

import example.Employee
import example.DataClassEmployee

fun sugarcoat() {
    // type inferred
    val a = "a"

    // no need to write 'new'
    val b = Employee()

    // named arguments
    val c = DataClassEmployee(age = 42)


    // nice equals
    "foo" == "bar"

    // succinct Strings
    "Emp data: age: ${b.age} city: ${b.city}"

    //explicit NPE check
    b!!.age

    // no semicolons

}