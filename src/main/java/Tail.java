public class Tail {
    public static void main(String[] args) {
        System.out.println(recursion(1));
    }

    public static int recursion(int i) {            // This is a tail-recursive function.
        if (i>30000) {                          // Its break condition is when i has surpassed 30000.
            return i;
        }
        else
            return recursion(i+1);      // This makes it tail-recursive, it only returns another call to itself.
        }
    }

    // Running this code results in a stack overflow, hence I believe that this shows Java does not support tail
    // recursion optimisation.
    // As an example of the stack, take i to be 1 initially, would look like:
    // recursion(1)
    // recursion(2)
    // recursion(3) ... and so on.
    // There is no extra data alongside each call to the function, therefore a tail recursion optimisation would
    // remove the earlier calls to the function, as it would know they are not needed again.

