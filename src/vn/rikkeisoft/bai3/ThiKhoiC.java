package vn.rikkeisoft.bai3;

import java.util.Scanner;

public class ThiKhoiC extends Thi{
	private double Van;
	private double Su;
	private double Dia;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thi khoi B");
		super.nhap();
		System.out.print("\tNhap diem toan: ");
		Van=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap diem hoa: ");
		Su=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap diem sinh: ");
		Dia=Double.parseDouble(sc.nextLine());
	}
	public void hienThi() {
		super.hienThi();
		System.out.printf("%4.2f %4.2f %4.2f%n",Van,Su,Dia);
	}
	public ThiKhoiC() {
		super();
	}
	public ThiKhoiC(String sbd, String hoten, String diachi, String mucut, double van, double su, double dia) {
		super(sbd, hoten, diachi, mucut);
		Van = van;
		Su = su;
		Dia = dia;
	}
	public double getVan() {
		return Van;
	}
	public void setVan(double van) {
		Van = van;
	}
	public double getSu() {
		return Su;
	}
	public void setSu(double su) {
		Su = su;
	}
	public double getDia() {
		return Dia;
	}
	public void setDia(double dia) {
		Dia = dia;
	}
	
	

}
