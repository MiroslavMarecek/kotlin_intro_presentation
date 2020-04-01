package example.a50Collections

import example.City
import example.Employee

class CollectionsKotlin {

    // SOURCE: https://www.emanprague.com/en/blog/kotlin-top-10-features-youll-love/
    fun getAverageAge(employees: List<Employee>): Double {
        return employees.filter{ it.city == City.PILSEN }.map{ it.age }.average()
    }
}

