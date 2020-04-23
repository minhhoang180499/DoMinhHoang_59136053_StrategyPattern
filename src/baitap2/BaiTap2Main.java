/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author DELL
 */
public class BaiTap2Main 
{
    public static void main(String[] args) {
        IThanhToan thanhToanOnline = new ThanhToanOnline();
        IThanhToan thanhToanCOD = new ThanhToanCOD();
        GioHang GH1 = new GioHang();
        GioHang GH2 = new GioHang();
        HangHoa HH1 = new HangHoa("Muối", 40000, "Muối Iot");
        HangHoa HH2 = new HangHoa("Nước Trái Cây", 300000, "Nước hương vị trái cây tổng hợp");
        HangHoa HH3 = new HangHoa("Thịt bò", 1500000, "Thịt bò Kobe");
        GH1.themHangHoa(HH1);
        GH1.themHangHoa(HH2);
        GH1.themHangHoa(HH3);
        GH1.setHinhThucTT(thanhToanOnline);
        GH1.thanhToan();
        System.out.println("--------- Giỏ Hàng 1 - Thanh Toán Online");
        GH1.inDS();
        GH2.themHangHoa(HH1);
        GH2.themHangHoa(HH2);
        GH2.themHangHoa(HH3);
        GH2.setHinhThucTT(thanhToanCOD);
        System.out.println("--------- Giỏ Hàng 2 - Thanh Toán COD");
        GH2.inDS();
        
        
    }
    
}
