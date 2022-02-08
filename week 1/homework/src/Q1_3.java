import java.util.ArrayList;
import java.util.Collections;

public class Q1_3
{
    public ArrayList<String> inputWords()
    {
        Input input = new Input();
        ArrayList<String> words = new ArrayList<String>();
        for (int n=0; n<10; n++)
        {
            System.out.print("Enter a word ");
            words.add(input.nextLine());
        }
        return words;
    }

    public void sort(ArrayList<String> words)
    {
        Collections.sort(words, Collections.reverseOrder());
    }

    public void go()
    {
        ArrayList<String> words = inputWords();
        sort(words);
        System.out.println(words);
    }
    public static void main(String[] args)
    {
        new Q1_3().go();
    }
}
