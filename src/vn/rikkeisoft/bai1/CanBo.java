package vn.rikkeisoft.bai1;

import java.util.Scanner;

public class CanBo {
	static Scanner sc= new Scanner(System.in);
	protected String hoten;
	protected int tuoi;
	protected String gioitinh;
	protected String diachi;
	
	public void nhap() {
		System.out.print("\tNhap ho ten: ");
		hoten=sc.nextLine();
		System.out.print("\tNhap tuoi: ");
		tuoi=Integer.parseInt(sc.nextLine());
		System.out.print("\tNhap gioi tinh: ");
		gioitinh=sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diachi=sc.nextLine();
	}
	public void hienThi() {
		System.out.printf("%-20s %5d %9s %7s",hoten,tuoi,gioitinh,diachi);
	}
	public CanBo() {
		super();
	}
	public CanBo(String hoten, int tuoi, String gioitinh, String diachi) {
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
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
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	

}
