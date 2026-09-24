/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author LENOVO
 */
public class BangunDatar {
    public double luas, keliling;
    public void hitungLuas(int par, int par1){
        luas = 0;
    }
    public void hitungKeliling(int par, int par1){
        keliling = 0;
    }
    public void tampilData(){
        System.out.println("LUAS = "+luas);
        System.out.println("KELILING = "+keliling);
    }
}
