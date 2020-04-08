package example.a10NullSafety

// Example - an endpoint done the Java way and the Kotlin way
class ExampleController {

    // Business rule: someDataJavaCapitalized cannot return null,
    // that is not a valid case. Error must be returned if it happens.

    //@GetMapping("/someDataJavaCapitalized")...
    fun getSomeDataJavaCapitalized(id: Int): String {
        val res = ExampleDaoJava().getSomeData(id)

        // we do NOT know whether this is null in compile time
        if (res == null) {
        }

        // NPE will be thrown? Maybe...
        // Should we return null if SomeData(id) not found? Maybe...
        return res.capitalize()
    }

    //@GetMapping("/someDataKotlinCapitalized")...
    fun getSomeDataKotlinCapitalized(id: Int): String {
        val res = ExampleDaoKotlin().getSomeData(id)

        // warning: condition always false
        if (res == null) {
        }

        // 1) we don't have to deal with possible null
        // 2) we know this in compile time
        return res.capitalize()
    }
}