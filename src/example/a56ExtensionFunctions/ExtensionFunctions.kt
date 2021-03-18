package example.a56ExtensionFunctions

class ExtensionFunctions {
    fun String.removeFirstAndLastChar(): String = this.substring(1, this.length - 1)



    fun someBusinessLogic() {
        val shaved = "Hello World".removeFirstAndLastChar()
    //            .
    //            .
    //            .
        // return
    }
}