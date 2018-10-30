/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan55handphone;

/**
 *
 * @author FairuzDay
 */
public class WindowsPhone extends Handphone{
     private String wpKeyStore;

    public WindowsPhone(String manufacture, String operatingSystem, String model, int harga, String wpKeyStore) {
        super(manufacture, operatingSystem, model, harga);
        this.wpKeyStore = wpKeyStore;
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
}
