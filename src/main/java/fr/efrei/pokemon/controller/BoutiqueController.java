package fr.efrei.pokemon.controllers;

import fr.efrei.pokemon.models.Boutique;
import fr.efrei.pokemon.services.BoutiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boutiques")
public class BoutiqueController {

    @Autowired
    private BoutiqueService boutiqueService;

    @GetMapping
    public List<Boutique> getAllItems() {
        return boutiqueService.getAllItems();
    }

    @GetMapping("/{id}")
    public Boutique getItemById(@PathVariable String id) {
        return boutiqueService.getItemById(id);
    }

    @PostMapping
    public Boutique createItem(@RequestBody Boutique boutique) {
        return boutiqueService.createItem(boutique);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable String id) {
        boutiqueService.deleteItem(id);
    }
}
