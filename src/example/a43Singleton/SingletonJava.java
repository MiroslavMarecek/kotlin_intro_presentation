package example.a43Singleton;

// SOURCE: https://www.emanprague.com/en/blog/kotlin-top-10-features-youll-love/
public class SingletonJava {
    // we may forget this, no longer a Singleton
    private SingletonJava() {
    }

    private static SingletonJava INSTANCE;

    public static SingletonJava getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonJava();
        }

        return INSTANCE;
    }

    public void doSomething() {

    }
}