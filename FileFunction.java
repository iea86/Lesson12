package by.epam.javabasic25.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileFunction
{

	public static void main( String [] args )
	{
		// create ArrayList to store the book objects
		List<Book> Library = new ArrayList<>();
		try
		{
			// create a Buffered Reader object instance with a FileReader
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ivanova\\Desktop\\Library.txt"));

			// read the first line from the text file
			String fileRead = br.readLine();

			// loop until all lines are read
			while (fileRead != null)
			{

				// use string.split to load a string array with the values from each line of
				// the file, using a comma as the delimiter
				String[] tokenize = fileRead.split(",");
				
				// assume file is made correctly
				// and make temporary variables for the three fields
				String title=tokenize[0];
				//System.out.println(title);

				String author=tokenize[1];
				//System.out.println(author);
				
				int yearPublished = Integer.parseInt(tokenize[2]);
				//System.out.println(yearPublished);

				// create temporary instance of Book object
				// and load with three data values
				 Book b = new Book(title,author, yearPublished);
				 
						
				// add to array list
				Library.add(b);

				// read next line before looping
				// if end of file reached 
				fileRead = br.readLine();
			}

			// close file stream
			br.close();
		}
		
		// handle exceptions
		catch (FileNotFoundException fnfe)
		{
			System.out.println("file not found");
		}

		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}

		// display collection of books
		for (Book each : Library)
		{
			System.out.println("====================");
			System.out.println(each.getTitle() + " " + each.getAuthor() + " " + each.getYearPublished());
			
			
			
		}

	}

}

