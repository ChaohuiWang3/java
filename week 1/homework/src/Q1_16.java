public class Q1_16
{
    private boolean isPermutation(char[] a, char[] b)
    {
        if (a.length != b.length)
        {
            return false;
        }
        for (int i = 0; i < a.length; ++i)
        {
            int countA = 0;
            int countB = 0;
            char c = a[i];
            for (int j = 0; j < a.length; ++j)
            {
                if (c == a[j])
                {
                    countA++;
                }
                if (c == b[j])
                {
                    countB++;
                }
            }

            if (countA != countB)
            {
                return false;
            }
        }
        return true;
    }
    private void assertTrue(boolean b, String message)
    {
        if (!b)
        {
            System.out.println("Test failed: " + message);
        }
    }
    private void runTest()
    {
        char[] a = {'a','b','c','d','e','f'};
        char[] b = {'a','b','c','d','e','f'};//{'a','b','c','d'};
        assertTrue(isPermutation(a, a), "a is not a permutation of a");
        assertTrue(isPermutation(b, b), "b is not a permutation of b");
        assertTrue(!isPermutation(a, b), "a is not different from b");
        assertTrue(!isPermutation(b, a), "b is not different from a");
        char[] c = {'f','e','d','c','b','a'};
        assertTrue(isPermutation(c, c), "c is not a permutation of c");
        assertTrue(isPermutation(a, c), "a is not a permutation of c");
        assertTrue(isPermutation(c, a), "c is not a permutation of a");
        char[] d = {'a','a','a','b'};
        char[] e = {'a','b','b','b'};
        assertTrue(isPermutation(d, d), "d is not a permutation of d");
        assertTrue(isPermutation(e, e), "e is not a permutation of e");
        assertTrue(!isPermutation(d, e), "d is not different from e");
        assertTrue(!isPermutation(e, d), "e is not different from d");
        char[] f = {'a'};
        assertTrue(isPermutation(f, f), "f is not a permutation of f");
        assertTrue(!isPermutation(f, e), "f is not different from e");
        char[] g = {};
        assertTrue(isPermutation(g, g), "g is not a permutation of g");
        assertTrue(!isPermutation(g, f), "g is not different from f");
        assertTrue(!isPermutation(g, e), "g is not different from e");
    }
    public static void main(final String[] args)
    {
        (new Q1_16()).runTest();
    }
}