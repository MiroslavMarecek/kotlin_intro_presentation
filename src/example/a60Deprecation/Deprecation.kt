package example.a60Deprecation

import com.outside.somelibrary.New6

// SOURCE https://www.youtube.com/watch?v=0sPzDwS55wM

class Deprecation {

    // Must elaborate
    @Deprecated
    fun old(input: String): String {
        return input
    }
    val a = old("AAA")

    // Works same as Java
    @Deprecated("Use new1(input)")
    fun old1(input: String): String {
        return input
    }

    // Replacements - tells the autocomplete what to replace tha call with
    @Deprecated("Use new5(input)", replaceWith = ReplaceWith("new5(input)"))
    fun old5(input: String): String {
        return input
    }

    fun new5(input: String): String {
        return input
    }
    // autosuggested replacement
    val a5 = old5("AAA")

    // Import replacements - you can specify a fully qualified class name
    @Deprecated("Use new6(input)",
        replaceWith = ReplaceWith("New6.new6(input)", imports = ["com.outside.somelibrary.New6"]))
    fun old6(input: String): String {
        return input
    }
    // autosuggested replacement
    val a6 = old6("AAA")
    
    // ---------------------- Deprecetion levels --------------------------

    // WARNING - Works same as Java
    @Deprecated("Use new2(input)", level = DeprecationLevel.WARNING)
    fun old2(input: String): String {
        return input
    }
    val a2 = old2("AAA")

    // ERROR - calls produce a compile-time error
    @Deprecated("Use new3(input)", level = DeprecationLevel.ERROR)
    fun old3(input: String): String {
        return input
    }
    val a3 = old3("AAA")

    // HIDDEN - won't be visible at all, to the compiler or to autocomplete
    @Deprecated("Use new4(input)", level = DeprecationLevel.HIDDEN)
    fun old4(input: String): String {
        return input
    }
    val a4 = old4("AAA")

    // ----------------- Relative deprecation levels ---------------------
    // Internal use only
    @DeprecatedSinceKotlin(
        warningSince = "1.3.72",
        errorSince = "1.4.20",
        hiddenSince = "1.4.31"
    )
    fun old7(input: String): String {
        return input
    }

    fun new7(input: String): String {
        return input
    }
    // autosuggested replacement
    val a7 = old7("AAA")

}