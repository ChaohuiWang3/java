import java.util.ArrayList;
import java.util.Collections;
public class Q1_12
{
    private Input input;
    private ArrayList<String> fileContent;
    public Q1_12()
    {
        input = new Input();
        fileContent = new ArrayList<String>();
    }
    public String getFileName(String message)
    {
        System.out.print(message);
        return input.nextLine();
    }
    public void readFile(String name)
    {
        FileInput fileInput = new FileInput(name);
        while (fileInput.hasNextLine())
        {
            fileContent.add(fileInput.nextLine());
        }
        fileInput.close();
    }
    public String reverseString(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    public void reverseEachLine()
    {
        for (int line = 0 ; line < fileContent.size() ; line++)
        {
            fileContent.set(line,reverseString(fileContent.get(line)));
        }
    }
    public void reverseOrderOfLines()
    {
        Collections.reverse(fileContent);
    }
    public void reverseFileContent()
    {
        reverseOrderOfLines();
        reverseEachLine();
    }
    public void writeFile(String name)
    {
        FileOutput output = new FileOutput(name);
        for (String line : fileContent)
        {
            output.writeString(line);
            output.writeEndOfLine();
        }
        output.close();
    }
    public void go()
    {
        String inputFile = getFileName("Enter name of file to reverse: ");
        String outputFile =
                getFileName("Enter name of file to write reverse file to: ");
        readFile(inputFile);
        reverseFileContent();
        writeFile(outputFile);
    }
    public static void main(String arg[])
    {
        new Q1_12().go();
    }
}