package xuatkho;

import java.util.ArrayList;
import java.util.Scanner;

public class xuatkho {
	public int maso;
	public int ngayxuatkho;
	public int soluong;
	public ArrayList<String> danhsach;
	public String tendonvi;
	public String tennhanvien;
	
	public int getmaso()
	{
		return maso;
	}
	public void setmaso(int maso)
	{
		this.maso = maso;
	}
	 public int getngayxuatkho()
	{
		return ngayxuatkho;
	}
	public void setngayxuatkho(int ngayxuatkho)
	{
		this.ngayxuatkho = ngayxuatkho;
	}
	public int getsoluong()
	{
		return soluong;
	}
	public void setsoluong(int soluong)
	{
		this.soluong = soluong;	
	}
	public ArrayList<String> getdanhsach() {
	    return danhsach;
	}
	public void setdanhsach(ArrayList<String> danhsach) {
	    this.danhsach = new ArrayList<sanpham>();
	}
	public String gettendonvi()
	{
		return tendonvi;
	}
	public void settendonvi(String tendonvi)
	{
		this.tendonvi = tendonvi;
	}
	public String gettennhanvien()
	{
		return tennhanvien;
	}
	public void settennhanvien(String tennhanvien)
	{
		this.tennhanvien = tennhanvien;
	}
	public void themsanpham(String tensanpham) {
		danhsach.add(tensanpham);
	}
	public void xoasanpham(String tensanpham) {
		danhsach.remove(tensanpham);
	}
	 public void nhapthongtin()
	    {
	    Scanner sc = new Scanner(System.in);
	System.out.println("nhập mã số đơn hàng xuất kho: ");
	maso =sc.nextInt();
	System.out.println("nhập ngày xuất kho: ");
	ngayxuatkho = sc.nextInt();
	System.out.println("nhập tổng số lượng: ");
	soluong = sc.nextInt();
	System.out.println("nhập danh sách sản phẩm có trong lô hàng xuất kho");
	 danhsach = new ArrayList<String>();
	    String line = sc.nextLine();
	        danhsach.add(line);
	        line = sc.nextLine();
	System.out.println("nhập tên đơn vị xuất kho: ");
	tendonvi =sc.nextLine();
	System.out.println("nhập tên nhân viên giám sát xuất kho: ");
	tennhanvien =sc.nextLine();
	    
	   }
	
		
	   
	    
	public void xuatthongtin() {
		System.out.println("Mã số đơn hàng xuất kho: "+this.maso);
		System.out.println("Ngày xuất kho: "+this.ngayxuatkho);
		System.out.println("Tổng số lượng sản phẩm: "+this.soluong );
		System.out.println("Tên đơn vị xuất kho: "+this.tendonvi);
		System.out.println("Tên nhân viên giám sát xuất kho: "+this.tennhanvien );
	    System.out.println("Danh sách sản phẩm: "+this.danhsach);
	    
	    
	    
	 }

		
	 public static void main(String[] args) {
		       

		xuatkho kho = new xuatkho();
		kho.nhapthongtin(); 
	    kho.xuatthongtin(); 
       
//	    kho.themsanpham();
//	    kho.xuatthongtin();
//
//	    kho.xoasanpham(); 
//	    kho.xuatthongtin();
		
		
	}
	}

