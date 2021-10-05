package vn.rikkeisoft.bai8;

import java.util.Scanner;

public class TheMuon extends SinhVien {
     private int id;
     private String ngaymuon;
     private String hantra;
     private int sohieusach;
     public void nhap() {
    	 Scanner sc= new Scanner(System.in);
    	 super.nhap();
    	 System.out.print("\tNhap id: ");
    	 id=Integer.parseInt(sc.nextLine());
    	 System.out.print("\tNhap ngay muon: ");
    	 ngaymuon=sc.nextLine();
    	 System.out.print("\tNhap han tra: ");
    	 hantra=sc.nextLine();
    	 System.out.print("\tNhap so hieu sach: ");
    	 sohieusach=Integer.parseInt(sc.nextLine());
    }
     public void hienThi() {
    	 super.hienThi();
    	 System.out.printf("%4d %9s %7s %12d%n",id,ngaymuon,hantra,sohieusach);
     }
	public TheMuon() {
		super();
	}
	public TheMuon(String hoten, int tuoi, String lop, int id, String ngaymuon, String hantra, int sohieusach) {
		super(hoten, tuoi, lop);
		this.id = id;
		this.ngaymuon = ngaymuon;
		this.hantra = hantra;
		this.sohieusach = sohieusach;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNgaymuon() {
		return ngaymuon;
	}
	public void setNgaymuon(String ngaymuon) {
		this.ngaymuon = ngaymuon;
	}
	public String getHantra() {
		return hantra;
	}
	public void setHantra(String hantra) {
		this.hantra = hantra;
	}
	public int getSohieusach() {
		return sohieusach;
	}
	public void setSohieusach(int sohieusach) {
		this.sohieusach = sohieusach;
	}
     
}
