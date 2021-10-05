package vn.rikkeisoft.bai1;

import java.util.Scanner;

public class KySu extends CanBo{
	private String NganhDT;
	static Scanner sc= new Scanner(System.in);
	
	public void nhap() {
		System.out.println("Nhap ky su");
		super.nhap();
		System.out.print("\tNganh dao tao: ");
		NganhDT=sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.printf("%7s%n",NganhDT);
	}

	public KySu() {
		super();
	}

	public KySu(String hoten, int tuoi, String gioitinh, String diachi, String nganhDT) {
		super(hoten, tuoi, gioitinh, diachi);
		NganhDT = nganhDT;
	}

	public String getNganhDT() {
		return NganhDT;
	}

	public void setNganhDT(String nganhDT) {
		NganhDT = nganhDT;
	}
	
	

}
