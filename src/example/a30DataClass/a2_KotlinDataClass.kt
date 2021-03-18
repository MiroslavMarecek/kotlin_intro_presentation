package example.a30DataClass

data class a2_KotlinDataClass(
    val id: Int,
    val name: String?,
    var surname: String = "A default surname"
)

// - No need to regenerate, no danger of losing docs, or annotations and logic doing so
// - No surprise logic can be hidden in getters/setters