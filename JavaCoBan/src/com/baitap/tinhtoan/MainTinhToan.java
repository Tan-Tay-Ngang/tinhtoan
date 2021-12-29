package com.baitap.tinhtoan;

public class MainTinhToan {
	
	public static final float SO_PI = 3.14f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tinh hieu
		long y1 = 1000000l;
		long y2 = 2000000l;
		System.out.println("Hieu cua y1 va y2 la: ");
		System.out.println(TinhToan.hieu(y1, y2));
		
		// tinh tich
		int t1 = 2;
		int t2 = 3;
		System.out.println("Tich cua t1 va t2 la: ");
		System.out.println(TinhToan.tich(t1, t2));
		
		// tinh thuong
		double z1 = 2.5;
		double z2 = 5;
		System.out.println("Thuong cua z1 va z2 la: ");
		System.out.println(TinhToan.thuong(z1, z2));
		
		//binh phuong
		double a = 2;
		System.out.println("Binh phuong cua a la: ");
		System.out.println(TinhToan.binhPhuong(a));
		
		//can bac hai
		double b = 4;
		System.out.println("Can bac hai cua b la :");
		System.out.println(TinhToan.canBac2(b));
		
		
		//tinh tong
		int x1 =1;
		int x2 =2;
		System.out.println("Tong cua x1 va x2 la: ");
		System.out.println(TinhToan.tong(x1, x2));
		
		//tich soPi va c
		double c = 2;
		System.out.println("Tich cua so Pi va c la: ");
		System.out.println(TinhToan.tichPiVaA(c));
		

	}

}
