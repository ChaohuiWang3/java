public class Q1_14
{
    private String getInput()
    {
        System.out.print("Enter the string to display: ");
        return new Input().nextLine();
    }
    private void writeLine(String message)
    {
        for (int i = 0; i < (80 - message.length()) / 2; i++)
        {
            System.out.print(' ');
        }
        System.out.println(message);
    }
    public static void main(String[] args)
    {
        Q1_14 application = new Q1_14();
        application.writeLine(application.getInput());
    }
}