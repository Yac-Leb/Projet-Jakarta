package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Bataille;
import fr.efrei.pokemon.repositories.BatailleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatailleService {

    @Autowired
    private BatailleRepository batailleRepository;

    public List<Bataille> getAllBattles() {
        return batailleRepository.findAll();
    }

    public Bataille getBattleById(String id) {
        return batailleRepository.findById(id).orElse(null);
    }

    public Bataille createBattle(Bataille bataille) {
        return batailleRepository.save(bataille);
    }
}
