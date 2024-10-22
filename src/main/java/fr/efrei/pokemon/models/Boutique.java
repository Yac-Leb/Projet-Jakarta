package fr.efrei.pokemon.models;

import jakarta.persistence.*;

@Entity
public class Boutique {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nom;

    private String description;

    private double prix;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
}
