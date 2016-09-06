/**
 * Created by gilpratte on 9/6/16.
 */
public class Single {

    // Static class variable so there is only one. Creates the one and only instance of this class.
    private static Single ourInstance = new Single();

    // Public static class getter method to get the one and only one instance
    public static Single getInstance() {
        return ourInstance;
    }

    // Private constructor so no other code can "new" this class into an object
    private Single() {
    }
}
