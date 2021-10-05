package vn.rikkeisoft.bai8;

import java.util.Scanner;

public class SinhVien {
	protected String hoten;
	protected int tuoi;
	protected String lop;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhap ho va ten:");
		hoten = sc.nextLine();
		System.out.print("\tNhap tuoi: ");
		tuoi = Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap lop: ");
		lop = sc.nextLine();
	}

	public void hienThi() {
		System.out.printf("%20s %4d %7s",hoten,tuoi,lop);

	}

	public SinhVien() {
		super();
	}

	public SinhVien(String hoten, int tuoi, String lop) {
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.lop = lop;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

}
