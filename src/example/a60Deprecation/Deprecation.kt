package example.a60Deprecation

// SOURCE https://www.youtube.com/watch?v=0sPzDwS55wM

class Deprecation {

    // Must elaborate, can't just slap the annotation in there
    @Deprecated
    fun foo(input: String): String {
        return input
    }

    val a = foo("AAA")

    // Works same as Java
    @Deprecated("Use bar1(input)")
    fun foo1(input: String): String {
        return input
    }

    val a1 = foo1("AAA")

    // Replacements - tells the autocomplete what to replace tha call with
    @Deprecated("Use bar5(input)", replaceWith = ReplaceWith("bar5(input)"))
    fun foo5(input: String): String {
        return input
    }

    fun bar5(input: String): String {
        return input
    }

    // autosuggested replacement
    val a5 = bar5("AAA")


    // --- Deprecetion levels ---
    // WARNING - Works same as Java
    @Deprecated("Use bar2(input)", level = DeprecationLevel.WARNING)
    fun foo2(input: String): String {
        return input
    }

    val a2 = foo2("AAA")

    // ERROR - calls produce a compile-time error
    @Deprecated("Use bar3(input)", level = DeprecationLevel.ERROR)
    fun foo3(input: String): String {
        return input
    }

    val a3 = foo3("AAA")

    // HIDDEN - won't be visible at all, to the compiler or to autocomplete
    @Deprecated("Use bar4(input)", level = DeprecationLevel.HIDDEN)
    fun foo4(input: String): String {
        return input
    }

    val a4 = foo4("AAA")

}