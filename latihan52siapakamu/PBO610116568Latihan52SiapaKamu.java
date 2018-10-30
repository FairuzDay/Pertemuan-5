/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan52siapakamu;

/*
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program Mahasiswa dan Dosen
 */
public class PBO610116568Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Manusia dosen = new Dosen();
        dosen.setNama("Radhika");
        dosen.setUmur(19);
        ((Dosen) dosen).setNip("101231231");
        ((Dosen) dosen).setMataKuliah("Android");
        ((Dosen) dosen).mengajarApa();
        
        System.out.println("");
        
        Manusia mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Yusuf");
        mahasiswa.setUmur(19);
        ((Mahasiswa) mahasiswa).setNim("101231231");
        ((Mahasiswa) mahasiswa).setKelas("PBO");
        ((Mahasiswa) mahasiswa).kelasApa();
    }
    
}
