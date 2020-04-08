package example.a31NullSafeCalls

class NullSafeCallKotlin {

    fun getCoolingSystem(computer: Computer): String? {
        return computer.graphicsCard?.collingSystem
    }
}

