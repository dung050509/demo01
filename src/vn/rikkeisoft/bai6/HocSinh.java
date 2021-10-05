package vn.rikkeisoft.bai6;

import java.util.Scanner;

public class HocSinh {
	private String hoten;
	private int tuoi;
	private String quequan;
	private String lop;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhap ho va ten: ");
		hoten=sc.nextLine();
		System.out.print("\tNhap tuoi: ");
		tuoi=Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap que quan: ");
		quequan=sc.nextLine();
		System.out.print("\tNhap lop: ");
		lop=sc.nextLine();
	}
	public void hienThi() {
		System.out.printf("%20s %5d %8s %5s%n",hoten,tuoi,quequan,lop);
	}
	public HocSinh() {
		super();
	}
	public HocSinh(String hoten, int tuoi, String quequan, String lop) {
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.quequan = quequan;
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
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	

}
