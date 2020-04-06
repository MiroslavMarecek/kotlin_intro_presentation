package example.a20ValVar

class ValVar {

    // Must declare whether reassignable or not
    fun valVar() {
        val foo = "foo"
        var bar = "bar"

        foo = "AAAAA" //val cannot be assigned
        bar = "BBBBB" //OK
    }

    // Same with Collections:
    fun immutableCollections() {
        val immutableList = listOf("a", "b", "c")
        immutableList.add("d")
        immutableList.remove("d")

        val mutableList = mutableListOf("a", "b", "c")
        mutableList.add("d")
        mutableList.remove("d")
    }

}