/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
class Obra {
    private int id;
    private String nom;
    private String descripcio;
    private int any;
    private String modalitat;
    private String autor;
    private ArrayList<String> fotos;

    public Obra(int id, String nom, String descripcio, int any, String modalitat, String autor, ArrayList<String> fotos) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.any = any;
        this.modalitat = modalitat;
        this.autor = autor;
        this.fotos = fotos;
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

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getModalitat() {
        return modalitat;
    }

    public void setModalitat(String modalitat) {
        this.modalitat = modalitat;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ArrayList<String> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<String> fotos) {
        this.fotos = fotos;
    }

    @Override
    public String toString() {
        return "Obra{" + "id=" + id + ", nom=" + nom + ", descripcio=" + descripcio + ", any=" + any + ", modalitat=" + modalitat + ", autor=" + autor + ", fotos=" + fotos + '}';
    }
    
    
}
