package vn.rikkeisoft.bai7;

import java.util.Scanner;

public class Nguoi {
	static int count =0;
     double luongcung;
	 double luongthuong;
	 double tienphat;
	 String hoten;
	int tuoi;
	int id;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhap luong cung: ");
		luongcung=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap luong thuong: ");
		luongthuong=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap tien phat: ");
		tienphat=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap ho va ten:");
		hoten=sc.nextLine();
		System.out.print("\tNhap tuoi: ");
		tuoi=Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap id: ");
		id=Integer.parseInt(sc.nextLine());

	}
	public void hienThi() {
		System.out.printf("%3d %-20s %4d %10.2f %10.2f %9.2f %15.2f%n",id,hoten,tuoi,luongcung,luongthuong,tienphat,luongthuclinh());
	}
	public double luongthuclinh() {
		return luongcung+luongthuong-tienphat;
	}
	String quequan;
	public Nguoi() {
		super();
	}
	public Nguoi(double luongcung, double luongthuong, double tienphat, String hoten, int tuoi,
			 String quequan) {
		super();
		this.luongcung = luongcung;
		this.luongthuong = luongthuong;
		this.tienphat = tienphat;
		this.hoten = hoten;
		this.tuoi = tuoi;
		id=++count;
		this.quequan = quequan;
	}
	public double getLuongcung() {
		return luongcung;
	}
	public void setLuongcung(double luongcung) {
		this.luongcung = luongcung;
	}
	public double getLuongthuong() {
		return luongthuong;
	}
	public void setLuongthuong(double luongthuong) {
		this.luongthuong = luongthuong;
	}
	public double getTienphat() {
		return tienphat;
	}
	public void setTienphat(double tienphat) {
		this.tienphat = tienphat;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	
	

}
