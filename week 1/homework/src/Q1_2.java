public class Q1_2
{
    public double[] inputDoubles()
    {
        Input input = new Input();
        double[] values = new double[10];
        for (int n=0; n<values.length; n++)
        {
            System.out.print("Enter a double ");
            values[n] = input.nextDouble();
        }
        return values;
    }

    public double average(double[] values)
    {
        double sum = 0.0;
        for (double value : values)
        {
            sum += value;
        }
        return sum/ values.length;
    }

    public void go()
    {
        double average = average(inputDoubles());
        System.out.println("The average is " + average);
    }

    public static void main(String[] args) {
        new Q1_2().go();
    }
}
