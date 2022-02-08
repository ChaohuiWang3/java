import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Q1_11
{
    private Map<Character,Integer> characterCounts;
    private Input input;
    public Q1_11()
    {
        characterCounts = new HashMap<Character,Integer>();
        input = new Input();
    }
    private void countChar(char c)
    {
        if (characterCounts.containsKey(c)){
            characterCounts.put(c,characterCounts.get(c) + 1);
        }
        else
        {
            characterCounts.put(c,1);
        }
    }
    private void readFile(String name)

    {
        FileInput file = new FileInput(name);
        while (file.hasNextChar())
        {
            char c = file.nextChar();
            countChar(c);
        }
        file.close();
    }
    private String getFileName(String message)
    {
        System.out.print(message);
        return input.nextLine();
    }
    private void printResult()
    {
        ArrayList<Character> characters =
                new ArrayList<Character>(characterCounts.keySet());
        Collections.sort(characters);
        for (Character c : characters)
        {
            System.out.println(c +
                    " (Unicode value " + (int)c.charValue() +
                    "): " + characterCounts.get(c));
        }
    }
    private void go()
    {
        String fileName = getFileName("Enter name of text file: ");
        readFile(fileName);
        printResult();
    }
    public static void main(String[] args)
    {
        new Q1_11().go();
    }
}