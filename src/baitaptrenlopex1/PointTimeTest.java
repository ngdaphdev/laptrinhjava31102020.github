package baitaptrenlopex1;

import junit.framework.TestCase;

public class PointTimeTest extends TestCase {
	public void testConstructor() {
		new PointTime(12, 30, 45);
		new PointTime(10, 30, 24);
		new PointTime(11, 30, 24);

	}

}
