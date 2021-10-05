package vn.rikkeisoft.bai9;

import java.util.Scanner;

public class BienLai {
	private int chiSoCu;
    private int chiSoMoi;
    private KhachHang khachHang = new KhachHang();
    
    public void nhap() {
        khachHang.nhap();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\tNhap chi so cu: ");
            chiSoCu = sc.nextInt();
            System.out.print("\tNhap chi so moi: ");
            chiSoMoi = sc.nextInt();
        } while (chiSoCu > chiSoMoi);
     
    }
     
    public void hienThi() {
    	khachHang.hienThi();
    	System.out.printf("%9d %10d %12.2f%n",chiSoCu,chiSoMoi,soTienPhaiTra ());
    }
    public double soTienPhaiTra () {
    	return   (double) (chiSoMoi - chiSoCu) *5;
    }
    
    public void suaThongTin() {
    	
    }
	public BienLai() {
		super();
	}
	public BienLai(int chiSoCu, int chiSoMoi, KhachHang khachHang) {
		super();
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.khachHang = khachHang;
	}
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
    

}
