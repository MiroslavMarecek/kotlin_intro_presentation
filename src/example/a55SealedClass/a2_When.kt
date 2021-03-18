package example.a55SealedClass

import kotlin.math.PI

//SOURCE: https://www.journaldev.com/18719/kotlin-sealed-class
class a2_When {

    fun eval(e: a1_Shape) =
        when (e) {
            // - Abstract by default - must access through the sealed class
            // error when we comment one of them out
            is a1_Shape.Circle -> println("Circle area is ${PI * e.radius * e.radius}")
            is a1_Shape.Square -> println("Square area is ${e.length * e.length}")
            is a1_Shape.Rectangle -> println("Rectagle area is ${e.length * e.breadth}")
        }

}