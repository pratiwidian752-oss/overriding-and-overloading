/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

/**
 *
 * @author LENOVO
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran l = new Lingkaran(14);
        l.hitungLuas(8, 3);
        l.hitungKeliling(8, 3);
        l.tampilData();
        System.out.println("----------");
        SegitigaSamaKaki sg = new SegitigaSamaKaki(8,3);
        sg.hitungLuas(8,3);
        sg.hitungKeliling(8,3);
        sg.tampilData();
        System.out.println("----------");
        SegiEmpat se = new SegiEmpat(5, 8);
        se.hitungLuas(8, 3);
        se.hitungKeliling(8, 3);
        se.hitungDiagonal();
        se.tampilData();
    }
}
