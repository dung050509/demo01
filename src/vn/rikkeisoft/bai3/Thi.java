package vn.rikkeisoft.bai3;

import java.util.Scanner;

public class Thi {
    protected String sbd;
    protected String hoten;
    protected String diachi;
    protected String mucut;
    public void nhap() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("\tNhap so bao danh: ");
    	sbd=sc.nextLine();
    	System.out.print("\tNhap ho ten: ");
    	hoten=sc.nextLine();
    	System.out.print("\tNhap dia chi: ");
        diachi=sc.nextLine();
    	System.out.print("\tNhap muc uu tien: ");
    	mucut=sc.nextLine();
    }
    public void hienThi() {
    	System.out.printf("%5s %20s %8s %7s",sbd,hoten,diachi,mucut);
    }
	public Thi() {
		super();
	}
	public Thi(String sbd, String hoten, String diachi, String mucut) {
		super();
		this.sbd = sbd;
		this.hoten = hoten;
		this.diachi = diachi;
		this.mucut = mucut;
	}
	public String getSbd() {
		return sbd;
	}
	public void setSbd(String sbd) {
		this.sbd = sbd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getMucut() {
		return mucut;
	}
	public void setMucut(String mucut) {
		this.mucut = mucut;
	}
    
}
