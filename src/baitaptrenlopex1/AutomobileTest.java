package baitaptrenlopex1;

import junit.framework.TestCase;

public class AutomobileTest extends TestCase {
	public void testConstructor() {
		new Automobile("blue", 1500, 150, true);
		new Automobile("black", 500, 120, false);
		new Automobile("red", 1000, 100.5, false);

	}
}
