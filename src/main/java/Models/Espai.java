package Models;

import java.util.ArrayList;

public class Espai {
private int id;
private String nom;
private String desc_ca;
private String desc_esp;
private String desc_ang;
private String adreca;
private int aforament;
private String tipus;
private ArrayList<String> modalitat;
private ArrayList<String> serveis;
private int telefon;
private String web;
private String email;
private int valoracio;
private ArrayList<Exposicio> exposicions;

    public Espai(int id, String nom, String desc_ca, String desc_esp, String desc_ang, String adreca, int aforament, String tipus, ArrayList<String> modalitat, ArrayList<String> serveis, int telefon, String web, String email, int valoracio, ArrayList<Exposicio> exposicions) {
        this.id = id;
        this.nom = nom;
        this.desc_ca = desc_ca;
        this.desc_esp = desc_esp;
        this.desc_ang = desc_ang;
        this.adreca = adreca;
        this.aforament = aforament;
        this.tipus = tipus;
        this.modalitat = modalitat;
        this.serveis = serveis;
        this.telefon = telefon;
        this.web = web;
        this.email = email;
        this.valoracio = valoracio;
        this.exposicions = exposicions;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc_ca() {
        return desc_ca;
    }

    public void setDesc_ca(String desc_ca) {
        this.desc_ca = desc_ca;
    }

    public String getDesc_esp() {
        return desc_esp;
    }

    public void setDesc_esp(String desc_esp) {
        this.desc_esp = desc_esp;
    }

    public String getDesc_ang() {
        return desc_ang;
    }

    public void setDesc_ang(String desc_ang) {
        this.desc_ang = desc_ang;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public int getAforament() {
        return aforament;
    }

    public void setAforament(int aforament) {
        this.aforament = aforament;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public ArrayList<String> getModalitat() {
        return modalitat;
    }

    public void setModalitat(ArrayList<String> modalitat) {
        this.modalitat = modalitat;
    }

    public ArrayList<String> getServeis() {
        return serveis;
    }

    public void setServeis(ArrayList<String> serveis) {
        this.serveis = serveis;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getValoracio() {
        return valoracio;
    }

    public void setValoracio(int valoracio) {
        this.valoracio = valoracio;
    }

    public ArrayList<Exposicio> getExposicions() {
        return exposicions;
    }

    public void setExposicions(ArrayList<Exposicio> exposicions) {
        this.exposicions = exposicions;
    }

    @Override
    public String toString() {
        return "Espai{" + "id=" + id + ", nom=" + nom + ", desc_ca=" + desc_ca + ", desc_esp=" + desc_esp + ", desc_ang=" + desc_ang + ", adreca=" + adreca + ", aforament=" + aforament + ", tipus=" + tipus + ", modalitat=" + modalitat + ", serveis=" + serveis + ", telefon=" + telefon + ", web=" + web + ", email=" + email + ", valoracio=" + valoracio + ", exposicions=" + exposicions + '}';
    }

   


}
