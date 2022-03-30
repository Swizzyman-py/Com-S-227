package lab6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HowManyLines
{
	
	
  public static void main(String[] args) throws FileNotFoundException
  {
    File file = new File("story.txt");
    Scanner scanner = new Scanner(file);
    int lineCount = 1;

    while (scanner.hasNextLine())
    {
      String line = scanner.nextLine();
      String[] howMany = line.split(" ");
      System.out.println(howMany.length);
      lineCount += 1;
    }
    scanner.close();
  }
}