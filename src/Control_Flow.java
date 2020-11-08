public class Control_Flow {

    public static int lowestCommon(long long1, long long2) {
        // Changing the longs to BinaryStrings, as I thought it would be easier to manipulate each character in a string rather than bitwise operations.
        String long1s = Long.toBinaryString(long1);
        String long2s = Long.toBinaryString(long2);
        // Initialising return_val to -1, so that if a value to return is not found (there are no matches), this will be the generic output.
        int return_val = -1;

        // This finds the shorter of the 2 strings, and sets that as the maximum number of iterations that will take place.
        // (as once the number of characters in the shorter string has been exceeded, we can conclude there will
        //not be a match and stop looking).
        int max_length = Math.min(long1s.length(), long2s.length());

        // This initialises i to be max_length, and sets the for loop to count down rather than up, this makes sense as we were using the LSB as index
        // 0, so to make this work with the charAt operator, when i was 0, I actually needed to be comparing the characters at the position [maxlength]
        // which this allows me to do.
        for (int i = max_length; i>=0; i-- ) {
            if (long1s.charAt(i-1) == long2s.charAt(i-1)) {         // Takes 1 from i as the indexing starts at 0 (so will be 1 less than expected).
                return_val = i-1;                                   // If a match is found, return_val is updated.
                break;                                              // As we are only looking for the earliest match, we break the loop here.
            }
        }
        return return_val;              // The value we found is returned, or if it was not updated, -1 is returned (no matches).
        }

    public static void main(String[] args) {
        int a = lowestCommon(17L, 18L);
        System.out.println(a);

        int b = lowestCommon(1L, 2L);
        System.out.println(b);

        int c = lowestCommon(14L, 25L);
        System.out.println(c);

    }

}
