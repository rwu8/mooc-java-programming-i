public class Book {
	private String author;
	private String title;
	private int pages;

	public Book(String author, String name, int pages) {
		this.author = author;
		this.title = name;
		this.pages = pages;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getName() {
		return this.title;
	}

	public int getPages() {
		return this.pages;
	}

	public String toString() {
		// J. K. Rowling, Harry Potter and the Sorcerer's Stone, 223 pages
		return getAuthor() + ", " + getName() + ", " + this.pages + " pages";
	}
}
