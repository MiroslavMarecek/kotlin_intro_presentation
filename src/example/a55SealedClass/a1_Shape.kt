package example.a55SealedClass

//SOURCE: https://www.journaldev.com/18719/kotlin-sealed-class
sealed class a1_Shape {
    class Circle(var radius: Float) : a1_Shape()
    class Square(var length: Int) : a1_Shape()
    class Rectangle(var length: Int, var breadth: Int) : a1_Shape()
}

// - "Enum on steriods"

