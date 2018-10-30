/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg101116568latihan56umurbarangantik;

/*
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Barang antik
 */
public class PBO6101116568latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Radio r = new Radio(200);
        r.setName("Radio Lama");
        System.out.println("Nama barang antik : " + r.getName());
        r.tampilUmur();
    }
    
}
