public class Q1_9
{
    private Input input;
    public Q1_9()
    {
        input = new Input();
    }
    private long inputLong(String prompt)
    {
        while (true)
        {
            System.out.print(prompt);
            String s = input.nextLine();
            try
            {
                return Long.parseLong(s);
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                        "The input could not be recognised, please try again.");
            }
        }
    }
    private boolean isPalindrome(long n)
    {
        String number = "" + n;
        return number.equals(
                new StringBuilder(number).reverse().toString());
    }
    private void go()
    {
        long number = inputLong("Enter number to check: ");
        if (isPalindrome(number))
        {
            System.out.println("Is a palindrome");
        }
        else
        {
            System.out.println("Is not a palindrome");
        }
    }
    public static void main(String[] args)
    {
        new Q1_9().go();
    }
}