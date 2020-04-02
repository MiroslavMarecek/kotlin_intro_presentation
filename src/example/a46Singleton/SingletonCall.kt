package example.a46Singleton

// SOURCE: https://www.emanprague.com/en/blog/kotlin-top-10-features-youll-love/
class SingletonCall {

    fun callSingletonJava() {
        SingletonJava.getInstance().doSomething()
    }

    fun callSingletonKotlin() {
        SingletonKotlin.doSomething()
    }

}