package example.a42ClassInheritance

// Classes are final by default, we must explicitly state
// that we want this class to be extendable
// open
class CantExtendThis {
    var foo: Int = 0

    constructor(foo: Int)
}