package example.a55SealedClass

//SOURCE: https://www.journaldev.com/18719/kotlin-sealed-class

// - abstract
sealed class A{
    class B : A()
    class C : A()
    object D : A()
    {
        fun name()
        {
            println("Object D")
        }
    }
    data class E(var name: String) : A()

}