package vn.rikkeisoft.bai4;

import java.util.Scanner;

public class KhuPho {
	static Scanner sc= new Scanner(System.in);
	public static void nhapDs(HoGiaDinh[] ds) {
		System.out.println("Nhap danh sach cac ho gia dinh");
		for (int i = 0; i < ds.length; i++) {
			System.out.println("Nhap ho gia dinh thu " + (i + 1));
			ds[i] = new HoGiaDinh();
			ds[i].nhap();
		}
	}

	public static void tieuDe() {
		System.out.printf("%3s %20s %5s %7s %8s %9d %13d %n", "STT", "Ho ten", "Tuoi","Job", "CMT" ,"So nguoi","So nha");
	}

	public static void hienthiDs(HoGiaDinh[] ds) {
		System.out.println("\t\tDanh sach cac ho gia dinh");
		tieuDe();
		int stt = 1;
		for (HoGiaDinh h : ds) {
			System.out.printf("%-3d", stt++);
			h.hienThi();
		}

}
	public static void main(String[] args) {
		System.out.println("Nhap so luong ho gia dinh : ");
		HoGiaDinh[] ds = new HoGiaDinh[Integer.parseInt(Nguoi.sc.nextLine())];
		nhapDs(ds);
		hienthiDs(ds);
	}

}
