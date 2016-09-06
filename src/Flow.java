import java.util.ArrayList;

/**
 * Created by gilpratte on 9/6/16.
 */


public class Flow {

    Foo foo;
    Foo fooArray[];
    ArrayList<Foo> fooList = new ArrayList<>();

    // Assume there are getters and setters for the instance variables

    void someMethod() {

        if (foo.getCount() == 1) {
            System.out.println("boo");
            System.out.println("boo again");
        }

        if (foo.getCount() > 1) {
            if (foo.getCount() < 10) {
                System.out.println("boo");
                System.out.println("boo again");
            } else {
                System.out.println("boo hoo");
            }
        }

        if (foo.getCount() > 11) {
            System.out.println("boo");
        } else {
            System.out.println("boo again");
        }


        if (foo.getCount() > 11) {
            System.out.println("boo");
        } else if (foo.getCount() < 0) {
            System.out.println("boo hoo");
        } else {
            System.out.println("boo again");
        }

        if (foo.getCount() > 1 && foo.getCount() < 11) {
            System.out.println("boo");
            System.out.println("boo again");
        }

        if (foo.getCount() < 1 || foo.getCount() > 11) {
            System.out.println("boo");
            System.out.println("boo again");
        }

        if ((foo.getCount() < 1 || foo.getCount() > 11) ||
                (foo.getCount() != 12 && foo.getCount() < 100)) {
            System.out.println("boo");
            System.out.println("boo again");
        }


        Foo foo = fooArray[0];
        System.out.println(foo.getCount());

        for (int i = 0; i < fooArray.length; ++i) {
            foo = fooArray[i];
            System.out.println(foo.getCount());
        }

        for (Foo foo2 : fooArray) {
            System.out.println(foo2.getCount());
       }

        for (Foo foo2 : fooList) {
            if (foo2.getCount() > 100) {
                break;
            }
            System.out.println(foo2.getCount());
        }


        for (Foo foo2 : fooList) {
            if (foo2.getCount() > 100) {
                continue;
            }
            System.out.println(foo2.getCount());
        }

        while (foo.getCount() > 0) {
           // do something
       }

       do {
           // do something
       } while (foo.getCount() != 100);
    }

}
