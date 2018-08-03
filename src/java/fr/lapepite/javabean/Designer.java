package fr.lapepite.javabean;

import java.util.ArrayList;

public class Designer {
	
	private int id;
	
	private String nom;
	
	private ArrayList<Bijoux> listBijoux;

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

	public ArrayList<Bijoux> getListBijoux() {
		return listBijoux;
	}

	public void setListBijoux(ArrayList<Bijoux> listBijoux) {
		this.listBijoux = listBijoux;
	}
	
	public void addBijou(Bijoux bijou) {
		listBijoux.add(bijou);
	}
	

}
