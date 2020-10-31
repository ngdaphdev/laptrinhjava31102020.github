package baitaptrenlopex1;

import junit.framework.TestCase;

public class House extends TestCase {
	String kind;// ten phong
	String numberRooms;// so phong
	double price;// gia phong
	String address;// dia diem
	String city;// thanh pho cua house

	public House(String kind, String numberRooms, double price, String address, String city) {
		super();
		this.kind = kind;
		this.numberRooms = numberRooms;
		this.price = price;
		this.address = address;
		this.city = city;
	}

}
