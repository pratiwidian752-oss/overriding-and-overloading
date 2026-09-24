/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author LENOVO
 */
public class SegiEmpat extends BangunDatar{
    public double panjang, lebar, diagonal;
    public SegiEmpat(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void hitungLuas(int par, int par1){
        luas = panjang*lebar;
    }
    public void hitungKeliling(int par, int par1){
        keliling = 2*(panjang+lebar);
    }
    public void hitungDiagonal(){
        diagonal = Math.sqrt((panjang*panjang)+(lebar*lebar));
    }
    public void tampilData(){
        System.out.println("PANJANG "+panjang);
        System.out.println("LEBAR "+lebar);
        System.out.println("DIAGONAL "+diagonal);
        super.tampilData();
    }
}