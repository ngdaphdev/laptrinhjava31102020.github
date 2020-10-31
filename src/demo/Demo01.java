package demo;

import java.util.Scanner;

public class Demo01 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhập số tự nhiên n :");
		
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Đây là số chẵn");
		}else {
			System.out.println("Đây là số lẻ");
		}
		
	}

}
