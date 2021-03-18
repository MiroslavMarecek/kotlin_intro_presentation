package example.a10NullSafety

// Example - data retrieval done the Kotlin way
class a1_ExampleControllerKotlin {

    //@GetMapping("/someDataKotlinCapitalized")...
    fun getSomeDataKotlinCapitalized(id: Int): String {
        val res = ExampleDaoKotlin().getSomeData(id)

        // warning: condition always false
        if (res == null) {
        }

        // 1) No ambiguity - it's either one, or the other
        // 2) We don't have to deal with possible null
        // 3) We know this in compile time
        return res.capitalize()
    }

}