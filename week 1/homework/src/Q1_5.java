public class Q1_5
{
    public double inputDouble(Input input)
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
    public double calculate(double first, double second)
    {
        return Math.sqrt(first + second);
    }
    public static void main(String[] args)
    {
        Input input = new Input();
        Q1_5 q1_5 = new Q1_5();
        double first = q1_5.inputDouble(input);
        double second = q1_5.inputDouble(input);
        System.out.println("Result: " + q1_5.calculate(first,second));
    }
}