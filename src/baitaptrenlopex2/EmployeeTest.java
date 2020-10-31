package baitaptrenlopex2;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	
	//comment demo thay doi github
	public void testContructor() {
		new Employee("nam", 40);
		new Employee("mai", 30);
		new Employee("minh", 102);
	}

	public void testWage() {
		assertEquals(new Employee("nam", 40).wage(), 480);
		assertEquals(new Employee("mai", 30).wage(), 360);
		assertEquals(new Employee("minh", 100).wage(), 1200);
	}

	public void testTax() {
		assertEquals(new Employee("nam", 40).tax(), 72.0, 0.001);
		assertEquals(new Employee("mai", 30).tax(), 54.0, 0.001);
		assertEquals(new Employee("minh", 100).tax(), 180.0, 001);

	}

	public void testNetpay() {
		assertEquals(new Employee("nam", 40).netpay(), 408.0, 0.001);
		assertEquals(new Employee("mai", 30).netpay(), 306.0, 0.001);
		assertEquals(new Employee("minh", 100).netpay(), 1020.0, 0.001);
	}

	public void testRaisedWage() {
		assertEquals(new Employee("nam", 40).raisedWage(), 494.0, 0.001);
		assertEquals(new Employee("mai", 30).raisedWage(), 374.0, 0.001);
		assertEquals(new Employee("minh", 100).raisedWage(), 1214.0, 0.001);
	}

	public void testCheckOverTime() {
		assertTrue(new Employee("nam", 40).checkOverTime());
		assertTrue(new Employee("mai", 30).checkOverTime());
		assertFalse(new Employee("minh", 100).checkOverTime());

	}
}
