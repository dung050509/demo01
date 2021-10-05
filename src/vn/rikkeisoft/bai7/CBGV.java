package vn.rikkeisoft.bai7;

import java.util.ArrayList;
import java.util.Scanner;



public class CBGV {
	static ArrayList<Nguoi> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void hienThi() {
		System.out.printf("%3s %3s %-20s %4s %10s %10s %9s %15s%n","STT","ID","Ho va ten","Tuoi","Luong cung","Luong thuong","Tien phat","LuongTL");
		int stt=1;
		for(Nguoi ng:list) {
			System.out.printf("%-3d",stt++);
			ng.hienThi();
		}
	}

	public static void addstudent() {
		System.out.print("Nhap so giao vien can them: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Giao vien thu " + (i + 1) + " la:");
			Nguoi ng = new Nguoi();
			ng.nhap();
			list.add(ng);
		}
	}

	public static void remove() {
		System.out.println("Nhap id giao vien can xoa:");
		int id = Integer.parseInt(sc.nextLine());
		int d = -1;
		boolean timThay = false;
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				timThay = true;
				d = i;
				break;
			}
		}
		if(timThay==false) {
			  System.out.println("Khong tim thay so cmt ");
		  }
		  else {
			  list.remove(d);
		  }
	}
	public static void main(String[] args) {
		addstudent();
		hienThi();
		remove();
		System.out.println("Danh sach giao vien sau khi xoa ");
		hienThi();
      
	}
}
