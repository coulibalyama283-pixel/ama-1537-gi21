package com.akc.tech;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etudiant {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String nom;
private String prenom;
private String lieu;
private String classe;
private String filiere;
public Etudiant(Integer id, String nom, String prenom, String lieu, String classe, String filiere) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.lieu = lieu;
	this.classe = classe;
	this.filiere = filiere;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getLieu() {
	return lieu;
}
public void setLieu(String lieu) {
	this.lieu = lieu;
}
public String getClasse() {
	return classe;
}
public void setClasse(String classe) {
	this.classe = classe;
}
public String getFiliere() {
	return filiere;
}
public void setFiliere(String filiere) {
	this.filiere = filiere;
}

}
