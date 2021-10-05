package vn.rikkeisoft.bai4;

import java.util.Scanner;

public class HoGiaDinh extends Nguoi {
	private int songuoi;
	private int sonha;
	public void  nhap() {
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.print("\tNhap so nguoi:");
		songuoi=Integer.parseInt(sc.nextLine());
		System.out.print("\tNHap so nha:");
		sonha=Integer.parseInt(sc.nextLine());
	}
	public void hienThi() {
		super.hienThi();
		System.out.printf("%9d %13d",songuoi,sonha);
	}
	public HoGiaDinh() {
		super();
	}
	public HoGiaDinh(String hoten, int tuoi, String job, String cmt, int songuoi, int sonha) {
		super(hoten, tuoi, job, cmt);
		this.songuoi = songuoi;
		this.sonha = sonha;
	}
	public int getSonguoi() {
		return songuoi;
	}
	public void setSonguoi(int songuoi) {
		this.songuoi = songuoi;
	}
	public int getSonha() {
		return sonha;
	}
	public void setSonha(int sonha) {
		this.sonha = sonha;
	}
	

}
