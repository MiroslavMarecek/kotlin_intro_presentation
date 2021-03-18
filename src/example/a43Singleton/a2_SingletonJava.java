package example.a43Singleton;

// SOURCE: https://www.emanprague.com/en/blog/kotlin-top-10-features-youll-love/
public class a2_SingletonJava {
    // we may forget this, no longer a Singleton
    private a2_SingletonJava() {
    }

    private static a2_SingletonJava INSTANCE;

    public static a2_SingletonJava getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new a2_SingletonJava();
        }

        return INSTANCE;
    }

    public void doSomething() {

    }
}