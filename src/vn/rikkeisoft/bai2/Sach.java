package vn.rikkeisoft.bai2;

import java.util.Scanner;

public class Sach extends TaiLieu {
	static Scanner sc = new Scanner(System.in);
	private String tenTG;
	private int sotrang;
	public void nhap() {
		System.out.println("Nhap sach: ");
		super.nhap();
		System.out.print("\tNhap ten tac gia: ");
		tenTG=sc.nextLine();
		System.out.print("\tNhap so trang: ");
		sotrang=Integer.parseInt(sc.nextLine());
	}
	public void hienThi() {
		super.hienThi();
		System.out.printf("%20s %7d%n",tenTG,sotrang);
	}

	public Sach() {
		super();
	}

	public Sach(Scanner sc, String maTL, String tenNXB, int soBPH, String tenTG, int sotrang) {
		super(sc, maTL, tenNXB, soBPH);
		this.tenTG = tenTG;
		this.sotrang = sotrang;
	}

	public String getTenTG() {
		return tenTG;
	}

	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

}
