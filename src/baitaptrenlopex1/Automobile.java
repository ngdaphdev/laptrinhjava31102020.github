package baitaptrenlopex1;

import junit.framework.TestCase;

public class Automobile extends TestCase {
	String model;//mau xe
	int price; //gia xe
	double mileage; // van toc nhanh nhat xe dat duoc
	boolean used; // da su dung hay chua 

	public Automobile(String model, int price, double mileage, boolean used) {
		this.model = model;
		this.price = price;
		this.mileage = mileage;
		this.used = used;
	}
}