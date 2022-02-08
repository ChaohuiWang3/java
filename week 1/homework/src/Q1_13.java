public class Q1_13
{
    private static final String COMMENT_MARKER = "#";
    private String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
    private boolean isReverseOf(String s1, String s2)
    {
        String s = reverse(s2);
        return s1.equals(s);
    }
    private String tidyString(String s)
    {
        return s.toLowerCase().replaceAll("[^a-z]", "");
    }

    private boolean isPalindrome(String s)
    {
        return isReverseOf(tidyString(s), tidyString(s));
    }
    private String inputString(Input input, String message)
    {
        System.out.print(message);
        return input.nextLine();
    }
    private void processFile(String inFile, String outFile)
    {
        FileInput fileInput = new FileInput(inFile);
        FileOutput fileOutput = new FileOutput(outFile);
        checkEachLine(fileInput, fileOutput);
        fileOutput.close();
        fileInput.close();
    }
    private void checkEachLine(FileInput fileInput, FileOutput fileOutput)
    {
        while (fileInput.hasNextLine())
        {
            String line = fileInput.nextLine();
            // Ignore a comment line in the input file
            if (line.startsWith(COMMENT_MARKER)) { continue; }

            if (isPalindrome(line))
            {
                writePalindromeToFile(fileOutput, line);
            }
        }
    }
    private void writePalindromeToFile(FileOutput fileOutput, String line)
    {
        fileOutput.writeString(line);
        fileOutput.writeEndOfLine();
    }
    public void go()
    {
        Input input = new Input();
        String inFile = inputString(input, "Enter input file name:");
        String outFile = inputString(input, "Enter output file name:");
        processFile(inFile,outFile);
    }
    public static void main(final String[] args)
    {
        new Q1_13().go();
    }
}