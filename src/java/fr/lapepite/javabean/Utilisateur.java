/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.lapepite.javabean;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Utilisateur {
    
    private int id;
    
    private String nom;
    
    private String prenom;
    
    private String adresse;
    
    private String email;
    
    private String password;
    
    private boolean admin;
    
    private Panier panier;

    public int getId() {
        return id;
    }

    public Utilisateur setId(int id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public Utilisateur setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public Utilisateur setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public String getAdresse() {
        return adresse;
    }

    public Utilisateur setAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Utilisateur setEmail(String email) {
        this.email = email;
        return this;
    }

    public boolean isAdmin() {
        return admin;
    }

    public Utilisateur setAdmin(boolean admin) {
        this.admin = admin;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Utilisateur setPassword(String password) {
        this.password = password;
        return this;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

}
