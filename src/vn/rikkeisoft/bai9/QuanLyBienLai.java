package vn.rikkeisoft.bai9;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLyBienLai {
	 static ArrayList<BienLai> List = new ArrayList<>();
	 static Scanner sc = new Scanner(System.in);
	public static void add() {
		System.out.println("Nhap so luong bien lai la:");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("The muon thu " + (i + 1) + " la:");
			BienLai bl = new BienLai();
			bl.nhap();
			List.add(bl);
		}
	}
	public static void hienThi() {
		System.out.printf("%3s %20s %6s %7s %9s %10s %12s%n ","STT","Ho va ten","So nha","Ma SoCT","Chi so moi","Chi so cu","Tien phai tra");
		int stt=1;
		for (BienLai bl : List) {
			System.out.printf("%-3d",stt++);
		      bl.hienThi();
		}
	}
	public static void remove() {
		System.out.println("Nhap ma so cong to muon can xoa: ");
		int id = Integer.parseInt(sc.nextLine());
		int d = -1;
		boolean timThay = false;
		for (int i = 0; i < List.size(); i++) {
			if (id == List.get(i).getKhachHang().getMaSoCongTo()) {
				timThay = true;
				d = i;
				break;
			}
		}
		if(timThay==false) {
			  System.out.println("Khong tim thay ma so cong to ");
		  }
		  else {
			  List.remove(d);
	}
	}
	public static void main(String[] args) {
		int chon;
		do
		{
			System.out.println("\n================Chuong Trinh Quan Ly Bien Lai=================");
			System.out.println("Chon mot chuc nang quan ly");
			System.out.println("\t1. Them moi bien lai");
			System.out.println("\t2. xoa thong tin rieng cua moi ho");
			System.out.println("\t0. Thoat");
			System.out.print("Nhap lua chon cua ban:");
			chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				add();
				hienThi();
				break;
			case 2:
				remove();
				hienThi();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.print("Lua chon khonng hop le");
			}
		}while(true);
	}

}
