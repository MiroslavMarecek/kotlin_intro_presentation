package example.a70Sugarcoat

import example.a30DataClass.JavaPojo
import example.a50Collections.DataClassEmployee
import example.a50Collections.Employee

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
    "Emp data: age: ${b.age}, city: ${b.city}, local variable $a"

    // explicit, succinct NPE check
    val d = JavaPojo()
    val e = d.name!!

    // neat assignment with condition
    val condition = true;
    val x = if (condition) {
        13
    } else {
        100
    }


    // no semicolons
    // ;)
}