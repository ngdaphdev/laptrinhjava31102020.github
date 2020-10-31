package baitaptrenlopex1;

import junit.framework.TestCase;

public class BookStore extends 	TestCase {
	String title; // tựa sách trong cửa hàng
	String authorName;// tên tác giả
	double price;// giá của sách
	int yearPublication;// năm xuất bản

	BookStore(String title, String authorName, double price, int yearPublication) {
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.yearPublication = yearPublication;
	}

}
