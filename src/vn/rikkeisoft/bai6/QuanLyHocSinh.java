package vn.rikkeisoft.bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
	static ArrayList<HocSinh> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int chon;
		do {
			System.out.println("===========Chuong trinh quan ly sach==============");
			System.out.println("\t1. Them hoc sinh moi ");
			System.out.println("\t2. Hien thi cac hoc sinh 20 tuoi");
			System.out.println("\t3. Cho biết số lượng các học sinh có tuổi là 23 và quê ở DN.");
			System.out.println("\t0. Thoat khoi chuong trinh");
			System.out.print("\tNhap lua chon cua ban: ");
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				addstudent();
				break;
			case 2:
				show();
				break;
			case 3:
				showamount();
			case 0:
				System.out.println("Thoat khoi chuong trinh thanh khong");
			}
		} while (true);
	}

	public static void addstudent() {
		System.out.print("Nhap so sinh vien can them: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Hoc sinh thu " + (i + 1) + " la:");
			HocSinh hs = new HocSinh();

			hs.nhap();
			list.add(hs);
		}

	}

	public static void show() {
		System.out.println("Cac hoc sinh 20 tuoi la");
		for (HocSinh hs : list) {
			if (hs.getTuoi() == 20) {
				hs.hienThi();
			}
		}

	}

	public static void showamount() {
		System.out.println("So luong cac hoc sinh 23 tuoi va o DN la:");
		int dem = 0;
		for (HocSinh hs : list) {
			if (hs.getTuoi() == 23 && hs.getQuequan().equals("DN")) {
				dem++;
			}
		}
		System.out.println(dem);

	}

}
