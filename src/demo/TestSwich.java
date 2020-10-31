package demo;

import javax.swing.JOptionPane;

public class TestSwich {
	public static void main(String[]args) {
		char c;
		String str=JOptionPane.showInputDialog(null,
				"nhap vao ky tu","Tieu de",0);
		c= str.charAt(0);
		switch (c) {
		case 'a': case'e': case'i': case'o': case'u':
			System.out.println("ky tu nay la nguyen am");
			
			break;

		default:
			System.out.println("ky tu nay la phu am"); }
		System.exit(0);//ket thuc chuong trinh
		}
	}


