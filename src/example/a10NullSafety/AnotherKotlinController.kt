package example.a10NullSafety

import example.a30DataClass.KotlinDataClass

class AnotherKotlinController {

    //@GetMapping("/someOtherEndpoint")...
    fun foo(id: Int): String {
        val e = ExampleController()

        // if we call Java, we can(will) get a NPE in here.
        val outJava = e.getSomeDataJavaCapitalized(id).toLowerCase()

        // if we call Kotlin, we *know* that we won't get a NPE
        val outKotlin = e.getSomeDataKotlinCapitalized(id).toLowerCase()

        // can't assign nullable type to non-nullable field
        val outKotlinNull: String
        outKotlinNull = ExampleDaoKotlin().getPossibleNull()

        return outKotlin
    }
}