package example.a30DataClass

class a4_GettersGoHome {

    val foo = a2_KotlinDataClass(id = 4, name = "Bob")
    val bar = foo.id
    // no point to getters without expecting logic in them
    // especially helpful with booleans

}