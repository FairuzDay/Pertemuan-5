/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan54kordinat;

/*
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : koordinat
 */
public class PBO610116568Latihan54Kordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                     
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(12, 40, "Biru");
        System.out.println("Warna Koordinat\t"+ warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu\t x : "+ warnaKoordinat.getX()+ ", y : " + warnaKoordinat.getY());
    }
    
}
