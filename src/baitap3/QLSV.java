/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class QLSV 
{
   
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    ISoSanh<SinhVien> soSanhSV;
    
    public void themSinhVien(SinhVien sv)
    {
        dsSV.add(sv);
    }

    public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
        this.dsSV = dsSinhVien;
    }

    public void setSoSanhSV(ISoSanh<SinhVien> soSanhSV) {
        this.soSanhSV = soSanhSV;
    }
    
    public void sapXep()
    {
        Collections.sort(dsSV,soSanhSV::soSanh);
    }
    
       public void inDS()
    {
       for(int i=0; i<dsSV.size(); i++)
        { 
           System.out.println("Họ Và Tên Sinh Viên: " + dsSV.get(i).getHoTen() + "\n"+
                              "Ngày Sinh: " + dsSV.get(i).getNgaySinh() + "\n"+
                               "Điểm: " + dsSV.get(i).getDiemTB());
                    
        }
    }
            
}
