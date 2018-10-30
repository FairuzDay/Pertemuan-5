/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan52siapakamu;

/**
 *
 * @author FairuzDay
 */
class Dosen extends Manusia {

    public Dosen() {
    private String nip, mataKuliah;

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }        
    
    public void mengajarApa(){
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah);
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    }
    
}
