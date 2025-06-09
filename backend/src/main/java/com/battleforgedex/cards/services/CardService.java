package com.battleforgedex.cards.services;

import com.battleforgedex.cards.entities.Card;
import com.battleforgedex.cards.repositories.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;
    private final WebClient.Builder webClientBuilder;

    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    public List<Card> searchByName(String name) {
        return cardRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Card> searchByType(String type) {
        return cardRepository.findByTypesContainingIgnoreCase(type);
    }

    public List<Card> searchByRarity(String rarity) {
        return cardRepository.findByRarityContainingIgnoreCase(rarity);
    }

    public void syncCards() {
        WebClient webClient = webClientBuilder.build();
        Card[] cards = webClient.get()
                .uri("https://api.tcgdex.net/v2/en/cards")
                .retrieve()
                .bodyToMono(Card[].class)
                .block();

        if (cards != null) {
            cardRepository.saveAll(List.of(cards));
        }
    }
}