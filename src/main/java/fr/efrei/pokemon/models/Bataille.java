package fr.efrei.pokemon.models;

import jakarta.persistence.*;

@Entity
public class Bataille {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String pokemon1Id;
    private String pokemon2Id;
    private String gagnantId;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getPokemon1Id() { return pokemon1Id; }
    public void setPokemon1Id(String pokemon1Id) { this.pokemon1Id = pokemon1Id; }
    public String getPokemon2Id() { return pokemon2Id; }
    public void setPokemon2Id(String pokemon2Id) { this.pokemon2Id = pokemon2Id; }
    public String getGagnantId() { return gagnantId; }
    public void setGagnantId(String gagnantId) { this.gagnantId = gagnantId; }
}
