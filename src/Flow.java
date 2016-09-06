import java.util.ArrayList;

/**
 * Created by gilpratte on 9/6/16.
 */


public class Flow {

    // Foo instance
    Foo foo;

    // Foo array
    Foo fooArray[];

    // Foo ArrayList
    ArrayList<Foo> fooList = new ArrayList<>();

    // Assume there are getters and setters for the instance variables

    void someMethod() {

        // Basic if
        if (foo.getCount() == 1) {
            System.out.println("boo");
            System.out.println("boo again");
        }

        // Nested if
        if (foo.getCount() > 1) {
            if (foo.getCount() < 10) {
                System.out.println("boo");
                System.out.println("boo again");
            } else {
                System.out.println("boo hoo");
            }
        }

        // if - else
        if (foo.getCount() > 11) {
            System.out.println("boo");
        } else {
            System.out.println("boo again");
        }


        // if - else if - else
        if (foo.getCount() > 11) {
            System.out.println("boo");
        } else if (foo.getCount() < 0) {
            System.out.println("boo hoo");
        } else {
            System.out.println("boo again");
        }

        // Short circuit AND
        if (foo.getCount() > 1 && foo.getCount() < 11) {
            System.out.println("boo");
            System.out.println("boo again");
        }

        // Short circut OR
        if (foo.getCount() < 1 || foo.getCount() > 11) {
            System.out.println("boo");
            System.out.println("boo again");
        }

        // Use parenthesis for readability
        if ((foo.getCount() < 1 || foo.getCount() > 11) ||
                (foo.getCount() != 12 && foo.getCount() < 100)) {
            System.out.println("boo");
            System.out.println("boo again");
        }


        // Get the first element of the array
        Foo foo = fooArray[0];
        System.out.println(foo.getCount());

        // Old school for loop
        for (int i = 0; i < fooArray.length; ++i) {
            foo = fooArray[i];
            System.out.println(foo.getCount());
        }

        // New for loop works on arrays
        for (Foo foo2 : fooArray) {
            System.out.println(foo2.getCount());
        }

        // New for loop works on array lists
        for (Foo foo2 : fooList) {
            if (foo2.getCount() > 100) {
                // Bread out of loop
                break;
            }
            System.out.println(foo2.getCount());
        }

        //
        for (Foo foo2 : fooList) {
            if (foo2.getCount() > 100) {
                // Stop processing and go to top of for loop and get next element
                continue;
            }
            System.out.println(foo2.getCount());
        }

        // Check condition at beginning of loop
        while (foo.getCount() > 0) {
            // do something
        }

        // Check condition at end of loop
        do {
            // do something
        } while (foo.getCount() != 100);
    }

}
