package example.a41SmartCasting

//SOURCE: https://www.journaldev.com/19684/kotlin-type-checking-kotlin-type-casting
class SmartCasting {
    fun getName(obj: Any?) {

        // if we comment this out, smartlyCastStrinstring would
        // only be an "Any" variable
        if (obj == null || obj !is String) {
            return
        }

        // We know that this is String at compile time
        val smartlyCastString = obj

        println("Length of the string is ${smartlyCastString.length}")
    }

    fun print() {
        getName(null)
        getName("Anupam")
    }
}