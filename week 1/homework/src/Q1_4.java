import java.util.Random;
public class Q1_4
{
    private static final int RANDOM_COUNT = 10000;
    private Random generator;
    private double sum;
    private double minimum;
    private double maximum;
    public Q1_4()
    {
        generator = new Random();
        sum = 0.0;
        minimum = 0.0;
        maximum = 0.0;
    }
    private int sign()
    {
        return generator.nextBoolean() ? 1 : -1;
    }
    private double getDouble()
    {
        return generator.nextDouble() * sign();
    }
    private void generateDoubles(int count)
    {
        for (int counter = 0; counter < count; counter++)
        {
            double number = getDouble();
            sum += number;
            minimum = Math.min(minimum,number);
            maximum = Math.max(maximum,number);
        }
    }
    private void printResults()
    {
        System.out.println("Average: " + sum / RANDOM_COUNT);
        System.out.println("Min: " + minimum);
        System.out.println("Max: " + maximum);
    }

    public void go()
    {
        generateDoubles(RANDOM_COUNT);
        printResults();
    }
    public static void main(String[] args)
    {
        new Q1_4().go();
    }
}