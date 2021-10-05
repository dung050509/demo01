package vn.rikkeisoft.bai1;

import java.util.Scanner;

public class CongNhan extends CanBo {
	static Scanner sc = new Scanner(System.in);
	private int level;

	public void nhap() {
		System.out.println("Nhap cong nhan");
		super.nhap();
		System.out.print("\nNhap level: ");
		level = Integer.parseInt(sc.nextLine());
	}

	public void hienThi() {
		super.hienThi();
		System.out.printf("%5d%n", level);
	}

	public CongNhan() {
		super();
	}

	public CongNhan(String hoten, int tuoi, String gioitinh, String diachi, int level) {
		super(hoten, tuoi, gioitinh, diachi);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
