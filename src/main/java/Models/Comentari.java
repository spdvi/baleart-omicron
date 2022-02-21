/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Alumne
 */
public class Comentari {
    
    private String comentari;
    private String descripcio;
    private String espai_nom;
    private String usuari_nom;

    public Comentari(String comentari, String descripcio, String espai_nom, String usuari_nom) {
        this.comentari = comentari;
        this.descripcio = descripcio;
        this.espai_nom = espai_nom;
        this.usuari_nom = usuari_nom;
    }

    public String getComentari() {
        return comentari;
    }

    public void setComentari(String comentari) {
        this.comentari = comentari;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getEspai_nom() {
        return espai_nom;
    }

    public void setEspai_nom(String espai_nom) {
        this.espai_nom = espai_nom;
    }

    public String getUsuari_nom() {
        return usuari_nom;
    }

    public void setUsuari_nom(String usuari_nom) {
        this.usuari_nom = usuari_nom;
    }

    @Override
    public String toString() {
        return "Comentari{" + "comentari=" + comentari + ", descripcio=" + descripcio + ", espai_nom=" + espai_nom + ", usuari_nom=" + usuari_nom + '}';
    }
    
    
}
