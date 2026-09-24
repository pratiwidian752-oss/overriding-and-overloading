/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author LENOVO
 */
public class Lingkaran extends BangunDatar {
    public double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public void hitungLuas(int par, int par1){
        luas = 3.14*jariJari*jariJari;
    }
    public void hitungKeliling(int par, int par1){
        keliling = 2*3.14*jariJari;
    }
    public void tampilData(){
        System.out.println("JARI JARI = "+jariJari);
        super.tampilData();
    }
}
