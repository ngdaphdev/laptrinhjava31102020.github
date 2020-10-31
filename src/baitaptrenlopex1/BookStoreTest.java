package baitaptrenlopex1;

import junit.framework.TestCase;

public class BookStoreTest extends TestCase {

	public void testConstructor() {
		new BookStore("Robinson Crusoe", "Daniel Defoe", 15.50, 1719);
		new BookStore("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		new BookStore("Pat Conroy", "Beach Music", 9.50, 1996);

	}

}
