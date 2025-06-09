package com.battleforgedex.cards.repositories;

import com.battleforgedex.cards.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {
    List<Card> findByNameContainingIgnoreCase(String name);
    List<Card> findByTypesContainingIgnoreCase(String type);
    List<Card> findByRarityContainingIgnoreCase(String rarity);
}