package example.a10NullSafety


class ExampleController {

    //@GetMapping("/someDataJavaCapitalized")...
    fun getSomeDataJavaCapitalized(id: Int):String {
        val res = ExampleDaoJava().getSomeData(id)

        // we do NOT know whether this is null in compile time
        if (res == null) {}

        // NPE? maybe...
        return res.capitalize()
    }

    //@GetMapping("/someDataKotlinCapitalized")...
    fun getSomeDataKotlinCapitalized(id: Int):String {
        val res = ExampleDaoKotlin().getSomeData(id)

        // warning: condition always false
        if (res == null) {}
        // 1) we don't have to deal with possible null
        // 2) we know this in compile time

        return res.capitalize()
    }
}