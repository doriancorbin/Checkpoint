import java.io.*;
import java.util.*;

public class ApplicationSelection
{
public static void main(String [] args)
	{
    Scanner obj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Welcome to Big Data Processing Application");
		System.out.println("Please type the number that corresponds to which application you would like to run:");
		System.out.println("1. Apache Hadoop");
		System.out.println("2. Apache Spark");
		System.out.println("3. Jupyter Notebook");
		System.out.println("4. SonarQube and SonarScanner\n");
		System.out.println("Type the number here>");
		int i = obj.nextInt();
	}
}
