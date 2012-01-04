/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdata;

/**
 *
 * @author Dynastymasra
 */
public class UserDetail {
    private String nip;
    private String nama;
    private String ttl;
    private String jenis;
    private String golongan;
    private String gaji;
    private String telpon;
    private String email;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGaji() {
        return gaji;
    }
    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getGolongan() {
        return golongan;
    }
    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getTelpon() {
        return telpon;
    }
    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getTtl() {
        return ttl;
    }
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
}
