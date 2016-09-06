/**
 * Created by gilpratte on 9/6/16.
 */
public class Single {
    
    private static Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
