package example.a10NullSafety

class ExternalKotlinLibrary {
    fun getSomeData(id: Int?): String? {
        return "foo"
//        return null
    }
}