public class Q1_1
{
    public void inputUntilStopIsTyped()
    {
        Input input = new Input();
        String in;
        do
        {
            System.out.print("Enter some text, type 'stop' to exit the program: ");
            in = input.nextLine();
            System.out.println("You typed: " + in);
        } while (in.compareTo("stop") != 0);
    }
    public static void main(String[] args)
    {
        new Q1_1().inputUntilStopIsTyped();
    }
}