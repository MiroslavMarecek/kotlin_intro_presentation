package example.a10NullSafety

class ExampleDaoKotlin {

    fun getSomeData(id: Int): String {
        return ExternalKotlinLibrary().getSomeData(id) ?: throw Exception()

        // Caveat Java... ->
//        return ExternalJavaLibrary().getSomeData(id) //?: throw Exception()
    }

}