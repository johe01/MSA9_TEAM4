package MS_15;

import java.util.ArrayList;

class Book{
	String isbn;
	String title;
	String writer;
	String content;
	int price;
	public Book() {
		this("000000", "제목없음", "작가미상","내용없음",0);
	}
	
	public Book(String isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
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
		return isbn + " | " + title + "\t| " + writer + "\t| " + content + "\t| "
				+ price;
	}
	
}

public class Library {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<Book>();
		book.add(new Book("123123", "이게 자바냐", "감자바", "자바 감자바", 33000));
		book.add(new Book("112112", "정보처리기사", "김휴먼", "국가기술자격", 45000));
		book.add(new Book("001001", "실무 DB  ", "박디비", "디비디비딥", 60000));
		
		System.out.println("==================== ALOHA 스터디 도서관 ====================");
		for (Book one : book) {
			System.out.println(one);
		}
	}
	
}
