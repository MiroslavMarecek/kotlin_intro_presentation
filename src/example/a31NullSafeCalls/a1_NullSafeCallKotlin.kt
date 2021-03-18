package example.a31NullSafeCalls

class  a1_NullSafeCallKotlin {

    fun getCoolingSystem(computer: Computer): String? {
        // compiler checked - cannot jut get coolingSystem
        return computer.graphicsCard?.collingSystem
    }
}

