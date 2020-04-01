package example.a10NullSafety


class ExampleController {

    //@GetMapping("/someDataJavaCapitalized")...
    fun getSomeDataJavaCapitalized(id: Int):String {
        val javaDao = ExampleDaoJava()

        // we do NOT know whether this is null in compile time
        if (javaDao.getSomeData(id) == null) {}

        // NPE? maybe...
        return javaDao.getSomeData(id).capitalize()
    }

    //@GetMapping("/someDataKotlinCapitalized")...
    fun getSomeDataKotlinCapitalized(id: Int):String {
        val kotlinDao = ExampleDaoKotlin()

        // warning: condition always false
        if (kotlinDao.getSomeData(id) == null) {}

        // 1) we don't have to deal with possible null
        // 2) we know this in compile time
        return kotlinDao.getSomeData(id).capitalize()
    }
}