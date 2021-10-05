package vn.rikkeisoft.bai5;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private int soCMND;
	private String queQuan;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ tên khách hàng: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập quê quán: ");
		queQuan = sc.nextLine();
		System.out.print("Nhập số chứng minh nhân dân: ");
		soCMND = Integer.parseInt(sc.nextLine());
	}

	public void hienThi() {
		System.out.printf("%20s %7d %8s", hoTen, soCMND, queQuan);
	}
	public Nguoi() {
		super();
	}
	public Nguoi(String hoTen, int soCMND, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.soCMND = soCMND;
		this.queQuan = queQuan;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	

	
}
