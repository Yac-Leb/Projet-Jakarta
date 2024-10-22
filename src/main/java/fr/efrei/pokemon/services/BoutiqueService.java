package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Boutique;
import fr.efrei.pokemon.repositories.BoutiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoutiqueService {

    @Autowired
    private BoutiqueRepository boutiqueRepository;

    public List<Boutique> getAllItems() {
        return boutiqueRepository.findAll();
    }

    public Boutique getItemById(String id) {
        return boutiqueRepository.findById(id).orElse(null);
    }

    public Boutique createItem(Boutique boutique) {
        return boutiqueRepository.save(boutique);
    }

    public void deleteItem(String id) {
        boutiqueRepository.deleteById(id);
    }
}
