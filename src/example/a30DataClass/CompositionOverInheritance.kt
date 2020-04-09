package example.a30DataClass

// In this case, the customer made a change request to 
// to allow some Credit cards to be Premium cards.
// Premium cards additionally must have a name of their premium program, a list of benefits, and an avatar picture

data class CreditCard(
    val id: Int,
    val securityCode: String
)




























// You cannot extend data classes.
// We have to use composition, rather than inheritance.
// Not a feature per se, rather a pattern forced by omission.

data class CreditCard2(
    val id: Int,
    val securityCode: String, 
    val premiumProgram: PremiumProgram?
)

data class PremiumProgram (
    val id: Int,
    val name: String,
    val benefits: List<String>?,
    val avatarId: Long?
)
