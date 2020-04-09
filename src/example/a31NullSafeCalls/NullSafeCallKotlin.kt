package example.a31NullSafeCalls

class NullSafeCallKotlin {

    // compiler checked - cannot return non-nullable type
    fun getCoolingSystem(computer: Computer): String? {
        // compiler checked - cannot jut get cooligSystem
        return computer.graphicsCard?.collingSystem
    }
}

