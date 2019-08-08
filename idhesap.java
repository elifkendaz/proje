/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elif
 */
public class idhesap {
    private int musteri_id;
    private String hesapno;
    private String hesapturu;

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public String getHesapturu() {
        return hesapturu;
    }

    public void setHesapturu(String hesapturu) {
        this.hesapturu = hesapturu;
    }

    public idhesap(int musteri_id, String hesapno, String hesapturu) {
        this.musteri_id = musteri_id;
        this.hesapno = hesapno;
        this.hesapturu = hesapturu;
    }

   
    
}
