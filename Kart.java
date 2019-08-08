/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elif
 */
public class Kart {
    
    private int hesapno;
    private String kartno;
    private String kartTuru;

    public int getHesapno() {
        return hesapno;
    }

    public void setHesapno(int hesapno) {
        this.hesapno = hesapno;
    }

    public String getKartno() {
        return kartno;
    }

    public void setKartno(String kartno) {
        this.kartno = kartno;
    }

    public String getKartTuru() {
        return kartTuru;
    }

    public void setKartTuru(String kartTuru) {
        this.kartTuru = kartTuru;
    }

    public Kart(int hesapno, String kartno, String kartTuru) {
        this.hesapno = hesapno;
        this.kartno = kartno;
        this.kartTuru = kartTuru;
    }
    
    
    
    
    
    
}
