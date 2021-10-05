package vn.rikkeisoft.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
	static List<CanBo> canBoList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int chon;
		do {
			System.out.println("===========Chuong trinh quan ly can bo==============");
			System.out.println("\t1. Them moi can bo");
			System.out.println("\t2. Tim kiem theo ho ten");
			System.out.println("\t3. Hien thi thong tin va danh sach cac can bo");
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
			case 4:
				System.out.println("Thoat khoi chuong trinh thanh khong");
			}
		} while (true);
	}

	private static void inputData() {
		System.out.print("Nhap so can bo can them:");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
             CanBo canbo=createCanbo();
             canBoList.add(canbo);
		}

	}

	public static CanBo createCanbo() {
		CanBo canbo= null;
		System.out.println("\t1.Nhap thon tin cong nhan:");
		System.out.println("\t2.Nhap thon tin ky su:");
		System.out.println("\t3.Nhap thon tin Nhan Vien:");
		System.out.print("\tNhap lua chon cua ban: ");
		int chon= Integer.parseInt(sc.nextLine());
		switch(chon) {
		case 1:
			canbo = new CongNhan();
			break;
		case 2:
			canbo =new KySu();
			break;
		case 3:
			canbo =new NhanVien();
			break;
		}
		canbo.nhap();
		
		return canbo;
	}
	private static void searchName() {
		System.out.println("Nhap ten can bo can tim kiem :");
		String hoten=sc.nextLine();
		for (CanBo canbo : canBoList) {
			if(canbo.getHoten().equalsIgnoreCase(hoten)) {
				canbo.hienThi();
			}
		}

	}
	private static void show() {
		for (CanBo canbo : canBoList) {
			canbo.hienThi();
		}

	}

}
