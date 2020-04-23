/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author DELL
 */
public class BaiTap1Main 
{
    public static void main(String[] args) {
        
       context tinhToan = new context();
       tinhToan.setTinhToan(new Tru());
       System.out.println("75 + 12 = " +tinhToan.tinh(75,12));     
    
       tinhToan.setTinhToan(new Tru());
       System.out.println("54 - 78 = " +tinhToan.tinh(54, 78));
       
    }
}
