package fr.efrei.pokemon.controllers;

import fr.efrei.pokemon.models.Bataille;
import fr.efrei.pokemon.services.BatailleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batailles")
public class BatailleController {

    @Autowired
    private BatailleService batailleService;

    @GetMapping
    public List<Bataille> getAllBattles() {
        return batailleService.getAllBattles();
    }

    @GetMapping("/{id}")
    public Bataille getBattleById(@PathVariable String id) {
        return batailleService.getBattleById(id);
    }

    @PostMapping
    public Bataille createBattle(@RequestBody Bataille bataille) {
        return batailleService.createBattle(bataille);
    }
}
