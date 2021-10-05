package vn.rikkeisoft.bai1;

public class NhanVien extends CanBo{
	private String congviec;
	
	public void nhap() {
		System.out.println("Nhap cong nhan");
		super.nhap();
		System.out.print("\nNhap cong viec: ");
		congviec=sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.printf("%9s%n",congviec);
	}

	public NhanVien() {
		super();
	}

	public NhanVien(String hoten, int tuoi, String gioitinh, String diachi, String congviec) {
		super(hoten, tuoi, gioitinh, diachi);
		this.congviec = congviec;
	}

	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	
   

}
