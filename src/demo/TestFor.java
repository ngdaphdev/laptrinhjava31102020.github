package demo;

// chuong trinh tinh tonng cac so le tu 1 den 100
public class TestFor {
	public static void main(String[] args) {
		int tong = 0;
		for (int i = 1; i <= 100; i += 2)
			tong += i;
		System.out.println("tong=" + tong);

		// tinh tong cac so le tu 1 den 100
		int i = 1;
		while (i <= 100) {
			tong += i;
			i += 2;
		}
		System.out.println("tong=" + tong);
	}

}
