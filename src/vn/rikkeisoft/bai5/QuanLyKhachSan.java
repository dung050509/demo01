package vn.rikkeisoft.bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachSan {
	 static Scanner sc = new Scanner(System.in);
	 static ArrayList<KhachSan> List = new ArrayList<>();
	public static void nhap() {
		System.out.println("Nhập số lượng khách trọ: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin khách hàng thứ " + (i+1) + ":");
            KhachSan ks = new KhachSan();
            ks.nhap();
            List.add(ks);
        }
	}
	public static void removeCMD() {
		System.out.println("Nhap so cmt can xoa: ");
		int socmt = Integer.parseInt(sc.nextLine());
		int d = -1;
		boolean timThay = false;
		for (int i = 0; i < List.size(); i++) {
			if (socmt == List.get(i).getNguoi().getSoCMND()) {
				timThay = true;
				d = i;
				break;
			}
		}
		if(timThay==false) {
			  System.out.println("Khong tim thay so cmt ");
		  }
		  else {
			  List.remove(d);
	}
	}
	public static void hienThi() {
		System.out.printf("%3s %20s %7s %8s %5s %9s %9s %12s%n","STT","Ho va ten","So CMND","Que Quan","So NT","Loai phong","Gia phong","Tien Phong");
		int stt=1;
		for(KhachSan ks :List) {
			System.out.printf("%-3d",stt++);
			ks.hienThi();
		}
	}
	public static void main(String[] args) {
		nhap();
		hienThi();
		removeCMD();
		System.out.println("Danh sach sau khi xoa la:");
		hienThi();
		
	}
}
