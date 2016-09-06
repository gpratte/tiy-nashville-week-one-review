/**
 * Created by gilpratte on 9/6/16.
 */
public class Controller {

    public static void main(String args[]) {

        // foo1 is an instance
        Foo foo1 = new Foo();
        System.out.println("count for foo1 " + foo1.getCount());

        // Get the one and only instanceCount
        System.out.println("number of instances " + Foo.getInstanceCount());

        // foo2 is an instance
        Foo foo2 = new Foo(42);
        System.out.println("count for foo2 " + foo2.getCount());

        // Get the one and only instanceCount
        System.out.println("number of instances " + Foo.getInstanceCount());

        foo2.setCount(777);
        System.out.println("count for foo2 " + foo2.getCount());

        foo2.setCount(10,11);
        System.out.println("count for foo2 " + foo2.getCount());
    }
}
