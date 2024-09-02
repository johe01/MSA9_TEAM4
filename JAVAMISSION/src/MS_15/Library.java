package MS_15;

import java.util.ArrayList;

class Book{
	int isbn;
	String title;
	String writer;
	String content;
	int price;
	public Book() {
		
	}
	
	public Book(int isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", content=" + content + ", price="
				+ price + "]";
	}
	
}

public class Library {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<Book>();
		book.add(new Book(123123, "이게 자바냐", "감자바", "자바 감자바", 33000));
		book.add(new Book(112112, "정보처리기사", "감자바", "자바 감자바", 33000));
		
	}
}
