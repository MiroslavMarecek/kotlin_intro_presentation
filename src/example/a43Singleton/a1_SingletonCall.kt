package example.a43Singleton

// SOURCE: https://www.emanprague.com/en/blog/kotlin-top-10-features-youll-love/
class a1_SingletonCall {

    fun callSingletonJava() {
        a2_SingletonJava.getInstance().doSomething()
    }

    fun callSingletonKotlin() {
        a3_SingletonKotlin.doSomething()
    }

}