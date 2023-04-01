
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

	public class xuatkho {
		private String maKho;
		private String ngayXuatKho;
		private int soLuongMatHang;
//		public boolean isDeleted;
	    
		public xuatkho(String maKho, String ngayXuatKho, int soLuongMatHang) {
			super();
			this.maKho = maKho;
			this.ngayXuatKho = ngayXuatKho;
			this.soLuongMatHang = soLuongMatHang;
			
		}
		public xuatkho() {
	// TODO Auto-generated constructor stub
}
		public String getmaKho() {	
			return maKho;
		}

		public void setmaKho(String maKho) {
			this.maKho = maKho;
		}
		
		public String getngayXuatKho() {
			return ngayXuatKho;
		}

		public void setngayXuatKho(Date ngayXuatKho) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			this.ngayXuatKho = sdf.format(ngayXuatKho);
		}

		public int getsoLuongMatHang() {
			return soLuongMatHang;
		}

		public void setsoLuongMatHang(int soLuongMatHang) {
			this.soLuongMatHang = soLuongMatHang;
		}

//		public boolean isDeleted() {
//			return isDeleted;
//		}
	//
//		public void setDeleted(boolean isDeleted) {
//			this.isDeleted = isDeleted;
//		}
		 @Override
	public String toString() {
		return "xuatKho [maKho=" + maKho + ", ngayXuatKho=" + ngayXuatKho + ", soLuongMatHang=" + soLuongMatHang + "]";
	}
		 public void nhap() {
			    Scanner Sc = new Scanner(System.in);
			    System.out.println("nhập mã số đơn hàng xuất kho: ");
			    maKho = Sc.nextLine(); 
			    System.out.println("nhập ngày xuất kho: ");
			    ngayXuatKho = Sc.nextLine();
			    System.out.println("nhập số lượng hàng xuất kho: ");
			    soLuongMatHang = Sc.nextInt(); 
			}
 public class danhsachsanpham extends xuatkho{
    private int maSanPham;
    private String tenSanPham;
    private int soLuong;
    private double gia;
   
    public danhsachsanpham(int ma, String ten, int soLuong, double gia, String maKho, String ngayXuatKho, int soLuongMatHang) {
        super(maKho, ngayXuatKho, soLuongMatHang);
    	this.maSanPham = ma;
        this.tenSanPham = ten;
        this.soLuong = soLuong;
        this.gia = gia;
    }

public danhsachsanpham() {
		// TODO Auto-generated constructor stub
	}

	public int getma() {
        return maSanPham;
    }

    public void setmaSanPham(int ma) {
        this.maSanPham = ma;
    }

    public String getten() {
        return tenSanPham;
    }

    public void setten(String ten) {
        this.tenSanPham = ten;
    }

    public int getsoLuong() {
        return soLuong;
    }

    public void setsoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getgia() {
        return gia;
    }

    public void setgia(double gia) {
        this.gia = gia;
    }
    @Override
   	public String toString() {
   		return super.toString() + "danhsachsanpham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", gia=" + gia +"]";
   	}
//    public void nhap() {
//	    Scanner Sc = new Scanner(System.in);
//	    System.out.println("nhập mã số đơn hàng xuất kho: ");
//	    maKho = Sc.nextLine(); 
//	    System.out.println("nhập ngày xuất kho: ");
//	    ngayXuatKho = Sc.nextLine();
//	    System.out.println("nhập số lượng hàng xuất kho: ");
//	    soLuong = Sc.nextInt(); 
//	}
    
    ArrayList<danhsachsanpham> DsList = new ArrayList<danhsachsanpham>();
    Scanner sc = new Scanner(System.in);
    
    public void nhapdanhsach() {
		
        while (true) {
            System.out.println("Nhập -1 để dừng lại");
            
            System.out.print("Nhập mã sản phẩm: ");
            int ma = sc.nextInt();
            if (ma == -1) {
                break;
            }
            
            sc.nextLine(); 
            
            System.out.print("Nhập tên sản phẩm: ");
            String ten = sc.nextLine();

            System.out.print("Nhập số lượng sản phẩm: ");
            int soLuong = sc.nextInt();

            System.out.print("Nhập giá sản phẩm: ");
            double gia = sc.nextDouble();
            
            System.out.println("");
           
            DsList.add(new danhsachsanpham(ma, ten, soLuong, gia, maKho, ngayXuatKho, soLuongMatHang));
        }


        for (danhsachsanpham product : DsList) {
            System.out.println("");
            System.out.println("Mã sản phẩm: " + product.getma());
            System.out.println("Tên sản phẩm: " + product.getten());
            System.out.println("Số lượng: " + product.getsoLuong());
            System.out.println("Giá: " + product.getgia());
            System.out.println("");
            
        }
    }

		 List<danhsachsanpham> List  = new ArrayList<danhsachsanpham>();
		  public void chucNang() {
			  
			        while (true) {
			            System.out.println("-------------MENU--------------");
			            System.out.println("1. Tìm kiếm sản phẩm có trong danh sách");
			            System.out.println("2. Cập nhật thông tin sản phẩm");
			            System.out.println("3. Sắp xếp giá sản phẩm giảm dần");
			            System.out.println("4. Sắp xếp giá sản phẩm tăng dần");
			            System.out.println("5. Xuất hóa đơn");
			            System.out.println("6. Thoát chương trình");
			            System.out.print("Vui lòng chọn chức năng: ");
			            int chucNang = sc.nextInt();
			            sc.nextLine();
			            
			            switch (chucNang) {
			                case 1:
			                	        System.out.print("Nhập tên sản phẩm cần tìm: ");
			                	        String tenSP = sc.nextLine();
			                			for (danhsachsanpham product : DsList) {
			                		        if (product.getten().equals(tenSP)) {
			                		            System.out.println("Thông tin sản phẩm:");
			                		            System.out.println("Mã sản phẩm: " + product.getma());
			                		            System.out.println("Tên sản phẩm: " + product.getten());
			                		            System.out.println("Số lượng: " + product.getsoLuong());
			                		            System.out.println("Giá: " + product.getgia());
			                		            return; // Thoát khỏi vòng lặp khi tìm thấy sản phẩm
			                		        }
			                		    }
			                		    
			                		    // Nếu không tìm thấy sản phẩm, in ra thông báo
			                		    System.out.println("Không tìm thấy sản phẩm có tên là " +tenSP);
			                			
			                    break;
			                case 2:
			                	 System.out.print("Nhập mã sản phẩm cần cập nhật thông tin: ");
			                	 int ma = sc.nextInt();
			                	 for (danhsachsanpham product : DsList) {
			             	        if (product.getma() == ma) {
			             	            System.out.println("Sửa thông tin sản phẩm: ");
			             	            System.out.print("Tên sản phẩm: ");
			             	            String ten = sc.nextLine();

			             	            System.out.print("Số lượng sản phẩm: ");
			             	            int soluong = sc.nextInt();

			             	            System.out.print("Giá sản phẩm: ");
			             	            double gia = sc.nextDouble();

			             	            // Cập nhật thông tin sản phẩm
			             	            product.setten(ten);
			             	            product.setsoLuong(soluong);
			             	            product.setgia(gia);

			             	            System.out.println("Thông tin sản phẩm đã được cập nhật thành công!");
			             	            return; // Thoát khỏi vòng lặp khi đã cập nhật sản phẩm
		                 	        }
			             	    }

			             	    // Nếu không tìm thấy sản phẩm, in ra thông báo
			             	    System.out.println("Không tìm thấy sản phẩm có mã là " + ma);
			                    break;
			                case 3:
			                	
			                	Collections.sort(DsList, new Comparator<danhsachsanpham>() {
			                		@Override
			                		public int compare(danhsachsanpham sp1, danhsachsanpham sp2) {
			                		if (sp1.getsoLuong() < sp2.getsoLuong()) {
			                		return 1;
			                		}
			                		return -1;
			                		}
			                		});
			                		System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo so luong:");
			                		for (danhsachsanpham product : DsList) {
			                		System.out.println("Mã sản phẩm: " + product.getma());
			                		System.out.println("Tên sản phẩm: " + product.getten());
			                		System.out.println("Số lượng: " + product.getsoLuong());
			                		System.out.println("Giá: " + product.getgia());
			                		System.out.println("");
			                		}
			                		break;
			                case 4:
			                	
			                	Collections.sort(DsList, new Comparator<danhsachsanpham>() {
			                		@Override
			                		public int compare(danhsachsanpham sp1, danhsachsanpham sp2) {
			                		if (sp1.getsoLuong() > sp2.getsoLuong()) {
			                		return 1;
			                		}
			                		return -1;
			                		}
			                		});
			                		System.out.println("Danh sách sản phẩm sau khi sắp xếp tăng dần theo so luong:");
			                		for (danhsachsanpham product : DsList) {
			                		System.out.println("Mã sản phẩm: " + product.getma());
			                		System.out.println("Tên sản phẩm: " + product.getten());
			                		System.out.println("Số lượng: " + product.getsoLuong());
			                		System.out.println("Giá: " + product.getgia());
			                		System.out.println("");
			                		}
			                		break;
			                
			                case 5:
			                	double tongTien = 0;
			                	System.out.println("Xuất hóa đơn:");
			                	System.out.println("Mã số đơn hàng xuất kho: " + getmaKho());
			      			    System.out.println("Ngày xuất kho: " + getngayXuatKho());
			      			    System.out.println("Số lượng mặt hàng xuất kho: " + getsoLuongMatHang());
			                	System.out.println("Mã sản phẩm\t\tTên sản phẩm\t\tSố lượng\t\tGiá");
			                	for (danhsachsanpham product : DsList) {
			                	System.out.println(product.getma() + "\t\t\t" + product.getten() + "\t\t\t" + product.getsoLuong() + "\t\t\t" + product.getgia());
			                	tongTien += product.getsoLuong() * product.getgia();
			                	}
			                	System.out.println("Tổng tiền: " + tongTien);
			                	break;
			                case 6:
			                	    System.out.println("Thoát chương trình");
			                	    System.exit(0);
			                	    break;
			                default:
			                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
			                    break;
			            }            
			        
		     }
		  }    
		 public static void main(String[] args) {
			xuatkho xk = new xuatkho();
			danhsachsanpham Ds = xk.new danhsachsanpham();
			xk.nhap();
			Ds.nhapdanhsach(); 
		    Ds.chucNang();
		}
	}

}
