
public class ToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =10;
		int y =14;
		
		int tong = x + y;
		int hieu = y - x;
		int tich = x * y;
		int thuong = x / y;
		int du = y % x;
		System.out.println(tong);
		System.out.println(hieu);
		System.out.println(tich);
		System.out.println(thuong);
		System.out.println(du);
		//so thuc
		float f1 = 3.5f;
		float f2 = 4.5f;
		float tongf = f1+f2;
		System.out.println(tongf);
		
		//nang kieu trong java
		byte b =4;
		short s =67;
		int i =100;
		long k = 400L;
		long tongL = k+b+s+i;
		int tongI = i + s + b;
		int tongK =(int)k + i + s;
		
		double d1= 40.5;
		double tongD = d1 + k;
		
		long tong1 = (long)d1 +k;
		System.out.println(tong1);
		
		//phep gan 
		
		int t =10;
		t=t +5;
		
		System.out.println(t);
		
		t +=5;
		System.out.println(t);
		t -=5;
		System.out.println(t);
		

	}

}
