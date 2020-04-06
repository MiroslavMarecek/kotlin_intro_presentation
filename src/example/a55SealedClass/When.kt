package example.a55SealedClass

//SOURCE: https://www.journaldev.com/18719/kotlin-sealed-class
class When {

    fun eval(e: Shape) =
        when (e) {
            is Shape.Circle -> println("Circle area is ${3.14 * e.radius * e.radius}")
            is Shape.Square -> println("Square area is ${e.length * e.length}")
            // error when we comment this out
            is Shape.Rectangle -> println("Rectagle area is ${e.length * e.breadth}")
        }

}