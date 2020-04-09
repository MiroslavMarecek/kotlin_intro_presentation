package example.a56ExtensionFunctions

class ExtensionFunctions {
    fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

    fun someBusinessLogic() {
        val shaved = "Hello World".removeFirstLastChar()
        // some logic that needs shaved
        // return
    }
}