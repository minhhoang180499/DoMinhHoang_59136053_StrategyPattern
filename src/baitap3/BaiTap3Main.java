/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author DELL
 */
public class BaiTap3Main 
{
    public static void main(String[] args) throws ParseException 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        QLSV dsSV = new QLSV();
        ISoSanh soSanhTheoDiem = new SoSanhTheoDiem();
        ISoSanh soSanhTheoTen = new SoSanhTheoTen();
        
        SinhVien sv1 = new SinhVien("Đỗ Minh Hoàng",sdf.parse("18-04-1999"),7);
        SinhVien sv2 = new SinhVien("Nguyễn Hoàng Long",sdf.parse("04-10-1999"),8);
        SinhVien sv3 = new SinhVien("Phạm Vương Lam Nhạc",sdf.parse("21-01-1999"),10);
        SinhVien sv4 = new SinhVien("Phạm Văn Pháp",sdf.parse("24-08-1999"),9);
        dsSV.themSinhVien(sv1);
        dsSV.themSinhVien(sv2);
        dsSV.themSinhVien(sv3);
        dsSV.themSinhVien(sv4);
        
        System.out.println("------- Sắp Xếp Theo Tên: ");
        dsSV.setSoSanhSV(soSanhTheoTen);
        dsSV.sapXep();
        dsSV.inDS();
        
        System.out.println("------- Sắp Xếp Theo Điểm");
        dsSV.setSoSanhSV(soSanhTheoDiem);
        dsSV.sapXep();
        dsSV.inDS();
        
    }
    
}
