package example.a55SealedClass

//SOURCE: https://www.journaldev.com/18719/kotlin-sealed-class
sealed class Shape {
    class Circle(var radius: Float) : Shape()
    class Square(var length: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
}

// - "Enum on crack"

// - Abstract by default - must access through the sealed class
