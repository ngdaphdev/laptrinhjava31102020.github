package baitaptrenlopex1;

import junit.framework.TestCase;

public class HouseTest extends TestCase {
	public void testContructor() {
		new House("Ranch", "7 rooms", 375.000, "23 Maple Street", "Brookline");
		new House("Colonial", "9 rooms", 450.000, "5 Joye Road", "Newton");
		new House("Cape", "6 rooms", 235.000, "83 Winslow Road", "Waltham");
	}

}
