/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author DELL
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>
{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int t;
        t = o1.getHoTen().compareTo(o2.getHoTen());
        if(t > 0) return 1;
        if(t == 0) return 0;
        else return -1;
    }
    
}
