package fr.efrei.pokemon.repositories;

import fr.efrei.pokemon.models.Boutique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoutiqueRepository extends JpaRepository<Boutique, String> {
}
