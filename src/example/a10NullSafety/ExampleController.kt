package example.a10NullSafety

// Example - an endpoint done the Java way and the Kotlin way
class ExampleController {

    //@GetMapping("/someDataJavaCapitalized")...
    fun getSomeDataJavaCapitalized(id: Int):String {
        val res = ExampleDaoJava().getSomeData(id)

        // we do NOT know whether this is null in compile time
        if (res == null) {
            val foo: Int = 0 // ignore this
        }

        // NPE? maybe...
        return res.capitalize()
    }

    //@GetMapping("/someDataKotlinCapitalized")...
    fun getSomeDataKotlinCapitalized(id: Int):String {
        val res = ExampleDaoKotlin().getSomeData(id)

        // warning: condition always false
        if (res == null) {
            val foo: Int = 0 // ignore this
        }
        // 1) we don't have to deal with possible null
        // 2) we know this in compile time

        return res.capitalize()
    }
}