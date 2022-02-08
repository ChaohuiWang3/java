public class Q1_10
{
    private String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    private boolean check(String s1, String s2)
    {
        String s = reverse(s2);
        return s1.equals(s);
    }
    private String getInput()
    {
        Input in = new Input();
        System.out.print("Enter text to check: ");
        return in.nextLine();
    }
    private String tidyString(String s)
    {
        return s.toLowerCase().replaceAll("[^a-z]", "");
    }
    public void testForPalindrome(String s)
    {
        if (check(tidyString(s), tidyString(s)))
        {
            System.out.println("Text is a palindrome.");
        }
        else
        {
            System.out.println("Text is not a palindrome.");
        }
    }
    public void go()

    {
        testForPalindrome(getInput());
    }
    public static void main(final String[] args)
    {
        new Q1_10().go();
    }
}