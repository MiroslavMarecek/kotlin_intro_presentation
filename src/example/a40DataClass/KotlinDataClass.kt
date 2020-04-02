package example.a40DataClass

data class KotlinDataClass(val id: Int,
                           val name: String?,
                           var surname: String = "A default surname")
// - Uses Kotlin's null-safe typing and default values

// - No easter eggs can be hidden in getters/setters

// - No need to regenerate

// - Less boilerplate