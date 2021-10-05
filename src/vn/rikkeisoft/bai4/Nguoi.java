package vn.rikkeisoft.bai4;

import java.util.Scanner;

public class Nguoi {
	static Scanner sc = new Scanner(System.in);
	protected String hoten;
	protected int tuoi;
	protected String job;
	protected String cmt;
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.print("\tNhap ho va ten: ");
		hoten=sc.nextLine();
		System.out.print("\tNHap tuoi: ");
		tuoi=Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap nghe nghiep: ");
		job=sc.nextLine();
		System.out.print("\tNhap chung minh thu: ");
		cmt=sc.nextLine();
	}
	public void hienThi() {
		System.out.printf("%20s %5d %7s %8s",hoten,tuoi,job,cmt);
	}
	public Nguoi() {
		super();
	}
	public Nguoi(String hoten, int tuoi, String job, String cmt) {
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.job = job;
		this.cmt = cmt;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	

}
