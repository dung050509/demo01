package vn.rikkeisoft.bai10;

import java.util.Scanner;

public class QuanLyVanBan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao xau ky tu: ");
		String xau=sc.nextLine();
		VanBan vb= new VanBan(xau);
		System.out.println("Xau vua nhap la: "+ xau);
		System.out.println("Xau chuan hoa la: "+ vb.chuanhoa(xau));
		System.out.println("So tu cua xau la: "+ vb.countWord(xau));
		System.out.println("So luong ky tu H la: "+ vb.countH(xau));
		
		sc.close();
	}

}
