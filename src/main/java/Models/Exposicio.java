package Models;


import java.util.ArrayList;

class Exposicio {
    private int id;
    private String nom;
    private String desc_ca;
    private String desc_esp;
    private String desc_ang;
    private ArrayList<Obra> obres;

    public Exposicio(int id, String nom, String desc_ca, String desc_esp, String desc_ang, ArrayList<Obra> obres) {
        this.id = id;
        this.nom = nom;
        this.desc_ca = desc_ca;
        this.desc_esp = desc_esp;
        this.desc_ang = desc_ang;
        this.obres = obres;
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

    public ArrayList<Obra> getObres() {
        return obres;
    }

    public void setObres(ArrayList<Obra> obres) {
        this.obres = obres;
    }
    
}
