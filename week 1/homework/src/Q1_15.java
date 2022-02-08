public class Q1_15
{
    private int inputInteger(Input input, String prompt)
    {
        while (true)
        {
            System.out.print(prompt);
            String s = input.nextLine();
            try
            {
                return Integer.parseInt(s);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not an integer, please try again.");
            }
        }
    }

    private int product(int start, int end)
    {
        if (start > end) { return 1; }
        return start * product(start+1,end);
    }
    public void go()
    {
        Input input = new Input();
        int start =
                inputInteger(input, "Enter integer at start of the range:");
        int end = inputInteger(input, "Enter integer at end of the range:");
        int result = product(Math.min(start,end),Math.max(start,end));
        System.out.println("The product is: " + result);
    }
    public static void main(final String[] args)
    {
        new Q1_15().go();
    }
}