package vn.rikkeisoft.bai9;

import java.util.Scanner;

public class KhachHang {
	private String hotenCN;
	private String sonha;
	private int maSoCongTo;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhap ten chu ho: ");
		hotenCN = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		sonha = sc.nextLine();
		System.out.print("\tMa so cong to: ");
		maSoCongTo = sc.nextInt();
	}

	public void hienThi() {
		System.out.printf("%20s %6s %7d", hotenCN, sonha, maSoCongTo);
	}

	public KhachHang() {
		super();
	}

	public KhachHang(String hotenCN, String sonha, int maSoCongTo) {
		super();
		this.hotenCN = hotenCN;
		this.sonha = sonha;
		this.maSoCongTo = maSoCongTo;
	}

	public String getHotenCN() {
		return hotenCN;
	}

	public void setHotenCN(String hotenCN) {
		this.hotenCN = hotenCN;
	}

	public String getSonha() {
		return sonha;
	}

	public void setSonha(String sonha) {
		this.sonha = sonha;
	}

	public int getMaSoCongTo() {
		return maSoCongTo;
	}

	public void setMaSoCongTo(int maSoCongTo) {
		this.maSoCongTo = maSoCongTo;
	}

}
