/**
 * Created by gilpratte on 9/6/16.
 */
public class Foo {

    // Instance variable (one for each Foo instance)
    private int count = 0;

    // Class variable (only one of these ever)
    private static int instanceCount = 0;

    public Foo() {
        ++instanceCount;
    }

    public Foo(int newCount) {
        ++instanceCount;
        count = newCount;
    }

    public void setCount(int newCount) {
        count = newCount;
    }

    public void setCount(int operand1, int operand2) {
        count = operand1 + operand2;
    }

    public int getCount() {
        return count;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}

