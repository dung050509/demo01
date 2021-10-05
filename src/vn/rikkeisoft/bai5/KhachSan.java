package vn.rikkeisoft.bai5;

import java.util.Scanner;

public class KhachSan {
	private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Nguoi nguoi = new Nguoi();
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        nguoi.nhap();
        System.out.print("Nhập số ngày trọ: ");
        soNgayTro = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập loại phòng: ");
        loaiPhong = sc.nextLine();
        System.out.print("Nhập giá phòng: ");
        giaPhong = sc.nextDouble();
    }
     
    public void hienThi() {
        nguoi.hienThi();
       System.out.printf("%5d %9s %9.2f %12.2f%n ",soNgayTro,loaiPhong,giaPhong,tinhTien());
    }
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
    
	public KhachSan() {
		super();
	}
	public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoi nguoi) {
		super();
		this.soNgayTro = soNgayTro;
		this.loaiPhong = loaiPhong;
		this.giaPhong = giaPhong;
		this.nguoi = nguoi;
	}
	public int getSoNgayTro() {
		return soNgayTro;
	}
	public void setSoNgayTro(int soNgayTro) {
		this.soNgayTro = soNgayTro;
	}
	public String getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public double getGiaPhong() {
		return giaPhong;
	}
	public void setGiaPhong(double giaPhong) {
		this.giaPhong = giaPhong;
	}
	public Nguoi getNguoi() {
		return nguoi;
	}
	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}
    

}
