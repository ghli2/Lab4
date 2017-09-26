/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * Does things.
 */
public class ReclamationProject {
    /**
     *
     * @param af a string
     * @param bf another string
     * @return the largest and first shared substring of a and b
     */
    static String doit(final String af, final String bf) {
        String a = af;
        String b = bf;
        if (a.length() > b.length()) {
            String c = a;
            a = b;
            b = c;
        }
        String r = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() -  j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
