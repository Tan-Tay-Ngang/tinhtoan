
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tinh chu vi va dien tich hinh chu nhat
		float chieuDai = 4.5f;
		float chieuRong = 3.4f;
		
		float chuViHinhCN = HinhChuNhat.chuVi(chieuDai, chieuRong);
		float dienTichCN = HinhChuNhat.dienTich(chieuDai, chieuRong);
		
		System.out.println("Chu vi va Dien tich Hinh Chu Nhat la");
		System.out.println(chuViHinhCN);
		System.out.println(dienTichCN);
		
		//hinh vuong
		float canhHinhVuong = 2.5f;
		
		
		System.out.println("Chu vi va Dien tich Hinh Vuong la :");
		System.out.println(HinhVuong.chuVi(canhHinhVuong));
		System.out.println(HinhVuong.dienTich(canhHinhVuong));
		
		//hinh tron
		float banKinh = 2f;
		
		System.out.println("chu vi va dien tich hinh tron la");
		System.out.println(HinhTron.chuVi(banKinh));
		System.out.println(HinhTron.dienTich(banKinh));
		
		

	}

}
