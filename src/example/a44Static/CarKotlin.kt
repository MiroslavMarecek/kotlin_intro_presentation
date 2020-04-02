package example.a44Static

class CarKotlin(val horsepowers: Int) {

    // - compiler-checked singleton, not a language-level construct
    // - Not spread out all over the place
    companion object Factory {
        val cars = mutableListOf<CarKotlin>()

        fun makeCar(horsepowers: Int): CarKotlin {
            val car = CarKotlin(horsepowers)
            cars.add(car)
            return car
        }
    }
}