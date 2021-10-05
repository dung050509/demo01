package vn.rikkeisoft.bai2;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPH;
	private String thangPH;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tap chi");
		super.nhap();
		System.out.print("\tNhap so phat hanh: ");
		soPH = Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap thang phat hanh: ");
		thangPH = sc.nextLine();
	}

	public void hienThi() {
		super.hienThi();
		System.out.printf("%4d %7s%n", soPH, thangPH);
	}

	public TapChi() {
		super();
	}

	public TapChi(Scanner sc, String maTL, String tenNXB, int soBPH, int soPH, String thangPH) {
		super(sc, maTL, tenNXB, soBPH);
		this.soPH = soPH;
		this.thangPH = thangPH;
	}

	public int getSoPH() {
		return soPH;
	}

	public void setSoPH(int soPH) {
		this.soPH = soPH;
	}

	public String getThangPH() {
		return thangPH;
	}

	public void setThangPH(String thangPH) {
		this.thangPH = thangPH;
	}

}
