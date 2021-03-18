package example.a20ValVar

class ValVar {

    fun valVar() {
        val foo = "foo"
        foo = "AAAAA" //val cannot be reassigned

        var bar = "bar"
        bar = "BBBBB" //OK

        var baz = "baz" // non-modified var warning
        val whatev = foo + bar + baz
    }

    // Similar approach used with with Collections:
    fun immutableCollections() {
        val immutableList = listOf("a", "b", "c")
        immutableList.add("d")
        immutableList.remove("d")

        val mutableList = mutableListOf("a", "b", "c")
        mutableList.add("d")
        mutableList.remove("d")
    }

    // - Explicitly declared as mutable or not, no ambiguous state.
    // - Compiler checked
    // - Self-documenting
    // - Succinct

}