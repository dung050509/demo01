package vn.rikkeisoft.bai3;

import java.util.Scanner;

public class ThiKhoiA extends Thi{
	private double Toan;
	private double Ly;
	private double Hoa;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thi khoi A");
		super.nhap();
		System.out.print("\tNhap diem toan: ");
		Toan=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap diem ly: ");
		Ly=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap diem hoa: ");
		Hoa=Double.parseDouble(sc.nextLine());
	}
	public void hienThi() {
		super.hienThi();
		System.out.printf("%4.2f %4.2f %4.2f%n",Toan,Ly,Hoa);
	}
	public ThiKhoiA() {
		super();
	}
	public ThiKhoiA(String sbd, String hoten, String diachi, String mucut, double toan, double ly, double hoa) {
		super(sbd, hoten, diachi, mucut);
		Toan = toan;
		Ly = ly;
		Hoa = hoa;
	}
	public double getToan() {
		return Toan;
	}
	public void setToan(double toan) {
		Toan = toan;
	}
	public double getLy() {
		return Ly;
	}
	public void setLy(double ly) {
		Ly = ly;
	}
	public double getHoa() {
		return Hoa;
	}
	public void setHoa(double hoa) {
		Hoa = hoa;
	}
	

}
