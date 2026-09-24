/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

/**
 *
 * @author LENOVO
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran l = new Lingkaran();
        l.hitungLuas(14);
        l.hitungKeliling(14);
        l.tampilData();
        System.out.println("----------");
        SegiTigaSamaKaki sg = new SegiTigaSamaKaki();
        sg.hitungLuas(8,3);
        sg.hitungKeliling(8,3);
        sg.tampilData();
        System.out.println("----------");
        SegiEmpat se = new SegiEmpat();
        se.hitungLuas(5,8);
        se.hitungKeliling(5,8);
        se.hitungDiagonal(5,8);
        se.tampilData();
    }
}
 