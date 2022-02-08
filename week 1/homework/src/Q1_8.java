public class Q1_8
{

    private Input input;
    public Q1_8()
    {
        input = new Input();
    }

    private double inputDouble(String prompt)
    {
        while (true)
        {
            System.out.print(prompt);
            String s = input.nextLine();
            try
            {
                return Double.parseDouble(s);
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                        "The input could not be recognised, please try again.");
            }
        }
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
                System.out.println(
                        "The input could not be recognised, please try again.");
            }
        }
    }
    private double millimetresToFeet(double millimetres)
    {
        return millimetres * 0.00328;
    }
    private double metresToInches(double metres)
    {
        return metres * 39.37;
    }
    private double kilometresToYards(double kilometres)
    {
        return kilometres * 1093.613;
    }
    private void convert(int selection)
    {
        double value = inputDouble("Enter value to convert: ");
        double result = doConversion(selection, value);
        System.out.println("Converted value: " + result);
    }
    private double doConversion(int selection, double value)
    {
        double result = 0.0;
        switch (selection)
        {
            case 1:
                result = millimetresToFeet(value);
                break;
            case 2:
                result = metresToInches(value);
                break;
            case 3:
                result = kilometresToYards(value);
                break;
        }
        return result;
    }
    private void displayMenu()
    {
        System.out.println("Conversion Program");
        System.out.println("1 -- Millimetres to Feet");
        System.out.println("2 -- Metres to Inches");
        System.out.println("3 -- Kilometres to Yards");
        System.out.println("4 -- Quit");
    }
    private void go()
    {
        while (true)
        {
            displayMenu();
            int selection = inputInteger("Select Option: ");
            if ((selection < 1) || (selection > 4))
            {
                System.out.println("Invalid selection, try again");
                continue;
            }
            if (selection == 4)
            {
                System.out.println("Goodbye");
                break;
            }
            convert(selection);
        }
    }

    public static void main(String[] args)
    {
        new Q1_8().go();
    }
}