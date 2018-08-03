package fr.lapepite.javabean;

public class Bijoux {
    
    private int id;
    
    private String nom;
    
    private String ref;
    
    private int prix;
    
    private Designer designer;
    
    private Categorie categorie;
    
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
    
    public String getRef() {
        return ref;
    }
    
    public void setRef(String ref) {
        this.ref = ref;
    }
    
    public int getPrix() {
        return prix;
    }
    
    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    public Designer getDesigner() {
        return designer;
    }
    
    public void setDesigner(Designer designer) {
        this.designer = designer;
    }
    
    public Categorie getCategorie() {
        return categorie;
    }
    
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    
    
    
}
