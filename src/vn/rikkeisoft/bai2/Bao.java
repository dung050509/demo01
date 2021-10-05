package vn.rikkeisoft.bai2;

import java.util.Scanner;

public class Bao extends TaiLieu{
	private String ngayPH;
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap bao:");
		super.nhap();
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPH=sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.printf("%7s%n",ngayPH);
	}

	public Bao() {
		super();
	}

	public Bao(Scanner sc, String maTL, String tenNXB, int soBPH, String ngayPH) {
		super(sc, maTL, tenNXB, soBPH);
		this.ngayPH = ngayPH;
	}

	public String getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(String ngayPH) {
		this.ngayPH = ngayPH;
	}
	

	
}
