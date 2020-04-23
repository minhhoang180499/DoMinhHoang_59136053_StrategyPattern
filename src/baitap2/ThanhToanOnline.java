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
public class ThanhToanOnline implements IThanhToan
{

    @Override
    public double thanhToan(int tienHang) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(tienHang <1000000) return tienHang*0.95;
        else return tienHang*0.93;
    }
    
    
}
