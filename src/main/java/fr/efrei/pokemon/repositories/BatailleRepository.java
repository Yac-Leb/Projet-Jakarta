package fr.efrei.pokemon.repositories;

import fr.efrei.pokemon.models.Bataille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatailleRepository extends JpaRepository<Bataille, String> {
}
