/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elif
 */
public class KartMusteri {
    
    private int musteri_id;
    private String musteriadi;
    private String musterisoyadi;
    private String hesapno;
    private String kartno;
    private String kartTuru;

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public String getMusteriadi() {
        return musteriadi;
    }

    public void setMusteriadi(String musteriadi) {
        this.musteriadi = musteriadi;
    }

    public String getMusterisoyadi() {
        return musterisoyadi;
    }

    public void setMusterisoyadi(String musterisoyadi) {
        this.musterisoyadi = musterisoyadi;
    }

    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
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

    public KartMusteri(int musteri_id, String musteriadi, String musterisoyadi, String hesapno, String kartno, String kartTuru) {
        this.musteri_id = musteri_id;
        this.musteriadi = musteriadi;
        this.musterisoyadi = musterisoyadi;
        this.hesapno = hesapno;
        this.kartno = kartno;
        this.kartTuru = kartTuru;
    }
    
    
    
    
    
    
}
