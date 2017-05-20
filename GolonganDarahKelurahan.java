/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.ktp;

/**
 *
 * @author Maulana Rizal
 */
public class GolonganDarahKelurahan {
    private String golonganDarah;
    private String kelurahan;

    public GolonganDarahKelurahan(String golD, String kelh) {
        this.golonganDarah = golonganDarah;
        this.kelurahan = kelurahan;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }
    
}
