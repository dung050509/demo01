package vn.rikkeisoft.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuanLySach {
	static List<TaiLieu> taiLieuList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int chon;
		do {
			System.out.println("===========Chuong trinh quan ly sach==============");
			System.out.println("\t1. Them moi tai lieu");
			System.out.println("\t2. Tim kiem  tai lieu theo loai");
			System.out.println("\t3. Hien thi thong tin ve tai lieu");
			System.out.println("\t4. Xoa tai lieu theo ma tai lieu");
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
				remove();
			case 0:
				System.out.println("Thoat khoi chuong trinh thanh khong");
			}
		} while (true);
	}

	private static void remove() {
		System.out.print("Nhap ma tai lieu can xoa:");
		String matl=sc.nextLine();
		for(TaiLieu tailieu:taiLieuList) {
			if(tailieu.getMaTL().equalsIgnoreCase(matl)) {
				taiLieuList.remove(tailieu);
				tailieu.hienThi();
			}
		}
	}

	private static void inputData() {
		System.out.print("Nhap so tai lieu can them:");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
             TaiLieu tailieu=createTaiLieu();
             taiLieuList.add(tailieu);
		}

	}

	public static TaiLieu createTaiLieu() {
		TaiLieu tailieu= null;
		System.out.println("\t1.Nhap thong tin sach:");
		System.out.println("\t2.Nhap thong tin tap chi:");
		System.out.println("\t3.Nhap thong tin bap:");
		System.out.print("\tNhap lua chon cua ban: ");
		int chon= Integer.parseInt(sc.nextLine());
		switch(chon) {
		case 1:
			tailieu = new Sach();
			break;
		case 2:
			tailieu =new TapChi();
			break;
		case 3:
			tailieu =new Bao();
			break;
		}
		tailieu.nhap();
		
		return tailieu;
	}
	private static void searchName() {
		System.out.println("Nhap tai lieu can bo can tim kiem :");
		String loai= sc.nextLine();
		for(TaiLieu tailieu:taiLieuList) {
			if(loai.equals("Sach")&& (tailieu instanceof Sach)) {
				tailieu.hienThi();
			}
			else if(loai.equals("TapChi")&& (tailieu instanceof TapChi)) {
				tailieu.hienThi();
			}
			else if(loai.equals("Bao")&& (tailieu instanceof Bao)) {
				tailieu.hienThi();
			}
		}

	}
	private static void show() {
		for (TaiLieu tailieu : taiLieuList) {
			tailieu.hienThi();
		}

	}

}
