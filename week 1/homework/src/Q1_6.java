public class Q1_6
{
    private double first;
    private double second;
    Input input;
    public Q1_6()
    {
        input = new Input();
    }
    private double inputDouble()
    {
        while (true)
        {
            System.out.print("Enter a double value: ");
            String s = input.nextLine();
            try
            {
                return Double.parseDouble(s);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not a double value, please try again.");
            }
        }
    }
    private double calculate()
    {
        return Math.sqrt(first + second);
    }
    public void go()
    {
        first = inputDouble();
        second = inputDouble();
        System.out.println("Result: " + calculate());
    }
    public static void main(String[] args)
    {
        new Q1_6().go();
    }
}
