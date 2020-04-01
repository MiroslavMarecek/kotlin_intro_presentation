package example.a10NullSafety

class AnotherKotlinController {

    //@GetMapping("/someOtherEndpoint")...
    fun foo(id: Int):String {
        val e = ExampleController()
        return e.getSomeDataKotlinCapitalized(id).toLowerCase()
    }
}