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
public class RTTempatLahir {
    private String rT;
    private String tempatLahir;

    public RTTempatLahir(String rT, String tempatLahir) {
        this.rT = rT;
        this.tempatLahir = tempatLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public String getrT() {
        return rT;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setrT(String rT) {
        this.rT = rT;
    }
    
}
