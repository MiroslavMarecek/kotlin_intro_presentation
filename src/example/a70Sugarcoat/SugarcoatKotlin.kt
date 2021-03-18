package example.a70Sugarcoat

import example.a30DataClass.a1_JavaPojo
import example.a50Collections.City
import example.a50Collections.DataClassEmployee
import example.a50Collections.Employee

fun sugarcoat() {

    // type inferred
    val a = "a"

    // no need to write 'new'
    val b = Employee()


    // named arguments - automatically synthesized constructor
    val c = DataClassEmployee(age = 42, city = City.PRAGUE)



    // nice equals
    "foo" == "bar"

    // succinct Strings
    val s = "Emp data - age: ${b.age}, city: ${b.city}."

    // explicit, succinct NPE check
    val d = a1_JavaPojo()
    val e = d.name!!

    // neat assignment with condition
    val condition = true
    val x = if (condition) {
        13
    } else {
        100
    }


    // no semicolons
    // ;)
}