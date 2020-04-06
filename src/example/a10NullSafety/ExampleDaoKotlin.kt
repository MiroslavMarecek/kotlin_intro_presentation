package example.a10NullSafety

class ExampleDaoKotlin {

    fun getSomeData(id: Int): String {
        val external = SomeExternalSystem()

//      If we try this, kotlin compiler will complain
//      What's that "String?" thing in the compilation error?
//        return null

        return external.getSomeData(id) ?: throw Exception()
    }

}