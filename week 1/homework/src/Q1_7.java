public class Q1_7
{
    private Input input;
    public Q1_7()
    {
        input = new Input();
    }
    private int inputInteger(String prompt)
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
                System.out.println("Not a double value, please try again.");
            }
        }
    }
    private String toBase(int number, int base)
    {
        return Integer.toString(number,base);
    }
    private void go()
    {
        int number = inputInteger("Enter number to convert: ");
        int base = inputInteger("Enter number base to convert to: ");
        System.out.println("Answer: " + toBase(number,base));
    }
    public static void main(String[] args)
    {
        new Q1_7().go();
    }
}