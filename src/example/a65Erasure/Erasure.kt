package example.a65Erasure

// SOURCE https://www.youtube.com/watch?v=0sPzDwS55wM
class Erasure {

    @JvmName("sortStrings")
    fun sort(strings: List<String>) {}

    @JvmName("sortInts")
    fun sort(ints: List<Int>) {}

    fun call() {
        sort(listOf(2, 1))
        sort(listOf("a", "c", "d", "c"))
        sort(listOf(true, false))
    }

    // same name in code, different in bytecode
}