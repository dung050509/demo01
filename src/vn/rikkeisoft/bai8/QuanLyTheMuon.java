package vn.rikkeisoft.bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTheMuon {
	static ArrayList<TheMuon> List = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void taoDs() {
		System.out.println("Nhap so luong the muon la:");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("The muon thu " + (i + 1) + " la:");
			TheMuon tm = new TheMuon();
			tm.nhap();
			List.add(tm);
		}
	}

	public static void hienThi() {
		System.out.printf("%3s %20s %4s %7s %4s %9s %7s %12s%n", "STT", "Ho va ten", "Tuoi", "Ten lop", "ID",
				"Ngay muon", "Han tra", "So hieu sach");
		int stt = 1;
		for (TheMuon tm : List) {
			System.out.printf("%-3d", stt++);
			tm.hienThi();
		}
	}

	public static void remove() {
		System.out.println("Nhap id the muon can xoa: ");
		int id = Integer.parseInt(sc.nextLine());
		int d = -1;
		boolean timThay = false;
		for (int i = 0; i < List.size(); i++) {
			if (id == List.get(i).getId()) {
				timThay = true;
				d = i;
				break;
			}
		}
		if(timThay==false) {
			  System.out.println("Khong tim thay the muon ");
		  }
		  else {
			  List.remove(d);
	}
		
}

	public static void main(String[] args) {
		taoDs();
		hienThi();
		remove();
		System.out.println("Danh sach the muon sau khi xoa la");
		hienThi();

	}

}
