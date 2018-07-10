package by.epam.javabasic25.classes;

public class Book {
	
	private String Title;
	private String Author;
	private int YearPublished;
	
	public Book() {
	}
		
	public Book(String Title,String Author, int YearPublished) {
	this.Title = Title;
	this.Author = Author;
	this.YearPublished = YearPublished;
	
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getYearPublished() {
		return YearPublished;
	}

	public void setYearPublished(int yearPublished) {
		YearPublished = yearPublished;
	}

	
	
}
	
	
	
	
