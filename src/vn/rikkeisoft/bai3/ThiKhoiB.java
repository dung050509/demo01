package vn.rikkeisoft.bai3;

import java.util.Scanner;

public class ThiKhoiB extends Thi {
	private double Toan;
	private double Hoa;
	private double Sinh;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thi khoi B");
		super.nhap();
		System.out.print("\tNhap diem toan: ");
		Toan=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap diem hoa: ");
		Hoa=Double.parseDouble(sc.nextLine());
		System.out.print("\tNhap diem sinh: ");
		Sinh=Double.parseDouble(sc.nextLine());
	}
	public void hienThi() {
		super.hienThi();
		System.out.printf("%4.2f %4.2f %4.2f%n",Toan,Hoa,Sinh);
	}
	public ThiKhoiB() {
		super();
	}
	public ThiKhoiB(String sbd, String hoten, String diachi, String mucut, double toan, double hoa, double sinh) {
		super(sbd, hoten, diachi, mucut);
		Toan = toan;
		Hoa = hoa;
		Sinh = sinh;
	}
	public double getToan() {
		return Toan;
	}
	public void setToan(double toan) {
		Toan = toan;
	}
	public double getHoa() {
		return Hoa;
	}
	public void setHoa(double hoa) {
		Hoa = hoa;
	}
	public double getSinh() {
		return Sinh;
	}
	public void setSinh(double sinh) {
		Sinh = sinh;
	}
	

}
