package example.a30DataClass

data class KotlinDataClass(
    val id: Int,
    val name: String?,
    var surname: String = "A default surname"
)
// - Uses Kotlin's null-safe typing and default values

// - No surprise logic can be hidden in getters/setters

// - No need to regenerate, no danger of losing docs,
//   or annotations and logic doing so

// - Less boilerplate