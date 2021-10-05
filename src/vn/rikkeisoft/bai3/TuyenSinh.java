package vn.rikkeisoft.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
	public class QuanLySach {
		static List<Thi> ThiList = new ArrayList<>();
		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {

			int chon;
			do {
				System.out.println("===========Chuong trinh tuyen sinh==============");
				System.out.println("\t1. Them moi thi sinh");
				System.out.println("\t2. Tim kiem theo so bao danh ");
				System.out.println("\t3. Hien thi thong tin cua thi sinh ");
				System.out.println("\t0. Thoat khoi chuong trinh");
				System.out.print("\tNhap lua chon cua ban: ");
				chon = Integer.parseInt(sc.nextLine());
				switch (chon) {
				case 1:
					inputData();
					break;
				case 2:
					searchName();
					break;
				case 3:
					show();
					break;
				case 0:
					System.out.println("Thoat khoi chuong trinh thanh khong");
				}
			} while (true);
		}

		private static void inputData() {
			System.out.print("Nhap so thi sinh can them:");
			int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
				Thi thi = createThi();
				ThiList.add(thi);
			}

		}

		public static Thi createThi() {
			Thi thi = null;
			System.out.println("\t1.Nhap thong tin khoi A:");
			System.out.println("\t2.Nhap thong tin khoi B:");
			System.out.println("\t3.Nhap thong tin khoi C:");
			System.out.print("\tNhap lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				thi = new ThiKhoiA();
				break;
			case 2:
				thi = new ThiKhoiB();
				break;
			case 3:
				thi = new ThiKhoiC();
				break;
			}
			thi.nhap();

			return thi;
		}

		private static void searchName() {
			System.out.println("Nhap tai lieu can bo can tim kiem :");
			String sbd = sc.nextLine();
			for (Thi thi : ThiList) {
				if (thi.getSbd().equalsIgnoreCase(sbd)) {
					thi.hienThi();
				}
			}

		}

		private static void show() {
			for (Thi thi : ThiList) {
				thi.hienThi();
			}

		}
	}
}
