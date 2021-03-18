package example.a44CompanionObjects

class a2_CarKotlin private constructor(val horsepowers: Int) {

    // language-level construct, not just a pattern
    companion object {
        val cars = mutableListOf<a2_CarKotlin>()

        fun makeCar(horsepowers: Int): a2_CarKotlin {
            val car = a2_CarKotlin(horsepowers)
            cars.add(car)
            return car
        }
    }

}