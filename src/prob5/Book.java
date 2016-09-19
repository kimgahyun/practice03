package prob5;

import java.util.Scanner;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode = 1;
	
	public Book( int bookNo, String title, String author )
	{
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	public int getBookNo() {
		return bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public void rent()
	{
		this.stateCode = 0;
		System.out.println(title + "이(가) 대여됐습니다.");
	}
	
	public void print()
	{
		String stateCode = (this.stateCode == 0 ? "대여중" : "재고있음");
		System.out.println( "책제목: " + title + ", 작가: " + author +", 대여유무: " + stateCode);
	}
}
