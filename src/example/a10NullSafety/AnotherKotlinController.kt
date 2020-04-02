package example.a10NullSafety

class AnotherKotlinController {

    //@GetMapping("/someOtherEndpoint")...
    fun foo(id: Int):String {
        val e = ExampleController()
        // if we called Java, we could get a NPE in here
        return e.getSomeDataKotlinCapitalized(id).toLowerCase()
    }
}