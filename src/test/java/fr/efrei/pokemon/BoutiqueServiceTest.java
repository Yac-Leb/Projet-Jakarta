package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Boutique;
import fr.efrei.pokemon.repositories.BoutiqueRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BoutiqueServiceTest {

    @Mock
    private BoutiqueRepository boutiqueRepository;

    @InjectMocks
    private BoutiqueService boutiqueService;

    public BoutiqueServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllItems() {
        when(boutiqueRepository.findAll()).thenReturn(Collections.singletonList(new Boutique()));

        assertFalse(boutiqueService.getAllItems().isEmpty());
        verify(boutiqueRepository, times(1)).findAll();
    }

    @Test
    void testGetItemById() {
        Boutique boutique = new Boutique();
        boutique.setId("1");
        when(boutiqueRepository.findById("1")).thenReturn(Optional.of(boutique));

        Boutique result = boutiqueService.getItemById("1");
        assertEquals("1", result.getId());
        verify(boutiqueRepository, times(1)).findById("1");
    }

    @Test
    void testCreateItem() {
        Boutique boutique = new Boutique();
        boutique.setNom("Potion");
        when(boutiqueRepository.save(boutique)).thenReturn(boutique);

        Boutique result = boutiqueService.createItem(boutique);
        assertNotNull(result);
        assertEquals("Potion", result.getNom());
        verify(boutiqueRepository, times(1)).save(boutique);
    }

    @Test
    void testDeleteItem() {
        boutiqueService.deleteItem("1");
        verify(boutiqueRepository, times(1)).deleteById("1");
    }
}
