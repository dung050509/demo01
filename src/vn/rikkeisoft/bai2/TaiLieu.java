package vn.rikkeisoft.bai2;

import java.util.Scanner;

public class TaiLieu {
	Scanner sc = new Scanner(System.in);
	protected String MaTL;
	protected String tenNXB;
	protected int soBPH;
	public void nhap() {
		System.out.print("\tNhap ma tai lieu: ");
		MaTL=sc.nextLine();
		System.out.print("\tNhap ten nha xua ban: ");
		tenNXB=sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBPH=Integer.parseInt(sc.nextLine());
	}
	public void hienThi() {
		System.out.printf("%5s %20s %5d",MaTL,tenNXB,soBPH);
	}
	public TaiLieu() {
		super();
	}
	public TaiLieu(Scanner sc, String maTL, String tenNXB, int soBPH) {
		super();
		this.sc = sc;
		MaTL = maTL;
		this.tenNXB = tenNXB;
		this.soBPH = soBPH;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public String getMaTL() {
		return MaTL;
	}
	public void setMaTL(String maTL) {
		MaTL = maTL;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getSoBPH() {
		return soBPH;
	}
	public void setSoBPH(int soBPH) {
		this.soBPH = soBPH;
	}
	
	

}
